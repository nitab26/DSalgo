
Feature: Graph practice
 

 Scenario: Graph Page Validation
    Given The user is on the datastructure homepage after sign in
    When The user clicks Get Started button below Graph
    Then The user should be navigated to Graph page

  Scenario Outline: Pages in Graph Page Validation
    Given The user is in the Graph page after logged in
    When The user clicks <pagelink> link
    Then The user should be directed to <pagelink> Page

    Examples: 
      | pagelink              |
      | Graph                 |
      | Graph Representations |

  Scenario Outline: Try Here Page Navigation
    Given The user is in the <pagelink> Page
    When The user clicks Try Here button in <pagelink> page
    Then The user should be directed to Graph Try Editor Page

    Examples: 
      | pagelink              |
      | Graph                 |
      | Graph Representations |
