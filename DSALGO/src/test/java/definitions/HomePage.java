package definitions;


import io.cucumber.java.en.*;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.home_Page;

public class HomePage extends home_Page{
	 WebDriver driver;
	 String URL = "https://dsportalapp.herokuapp.com";
	 home_Page home1 = new home_Page();
	 
	 @Given("The user should open the browser")
	public void the_user_should_be_open_the_browser() {
	    driver = new ChromeDriver();  
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("The user enter the DS_Algo Portal URL")
	public void the_user_enter_the_ds_algo_portal_url() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
	}

	@Then("The user should landed on the DS_Algo")
	public void the_user_should_landed_on_the_ds_algo() throws InterruptedException {
		driver.manage().window().maximize();
		home1.verifyMessage();
		//System.out.println("you are the right place");
	}


}
