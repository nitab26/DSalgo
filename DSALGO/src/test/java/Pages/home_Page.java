package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class home_Page {

	WebDriver driver;
	//WebElement rightMessage = driver.findElement(By.xpath("//div/p[contains(text(),'You are at the right place'])"));
	
	//@FindBy(xpath="//div[@class='content']//p[contains(text(),'You are at the right place')]")
	@FindBy(xpath="/html/body/div[1]/div/div/p")
	WebElement rightMessage;
	
	public home_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyMessage() throws InterruptedException {
		//String msg = "You are at the right place";
		Thread.sleep(3000);
		System.out.println(rightMessage.getText());
		Assert.assertEquals("You are at the right place", rightMessage.getText());
		//Assert.assertEquals("You are at the right place", msg);
		
	}
	
}
