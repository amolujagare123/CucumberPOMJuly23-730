Feature: all stock management scenarios

  @login
  Scenario Outline: to test the functionality of login button for invalid input
    Given I am on login page
    When I enter <username> and <password>
    And I click on login button
    Then I should get <correctUrl>
    Examples:
      | username  | password  | correctUrl                                                                                |
      | admin     | admin     | http://stock.scriptinglogic.org/dashboard.php                                             |
      | username1 | password1 | http://stock.scriptinglogic.org/index.php?msg=Wrong%20Username%20or%20Password&type=error |
      | username2 | password2 | http://stock.scriptinglogic.org/index.php?msg=Wrong%20Username%20or%20Password&type=error |


  @forgotPassword
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    When I click on forgot password link
    Then I should reach to the forgot password page

  @addCustomer
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    When I do login operation
    And I click on add customer link
    And I enter below data to add customer
      | Monali | my address | 66767676 | 8988989 |
    And I click on add button
    Then user should be added