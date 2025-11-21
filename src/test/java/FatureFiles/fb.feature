Feature: Facebook Registration Functionality

  Scenario Outline: Validate registration functionality
    Given user should be on registration page
    When user should enter firstname as "<Fname>" and sirname as "<Sname>"
    And user should enter date as "<Date>" and month as "<Month>" and year as "<Year>"
    And user should enter gender as "<Gender>"
    And user should enter email as "<Email>" and password as "<Password>"
    Then user should click on signup button

    Examples: 
      | Fname | Sname  | Date | Month | Year | Gender | Email             | Password    |
      | Sunil | Chetri |   22 | Jul   | 2017 | Male   | sunilcH@gmail.com | Azwdfvb314  |
      | Mukta | Sharma |   20 | Aug   | 2014 | Female | mukta@gmail.com   | oipwdfvb314 |
