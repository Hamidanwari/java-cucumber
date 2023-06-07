# to comment a line in the file --> type #
#Feature: is a file where your describe your descriptive language (steps args)

@Systemapps
Feature: Menu Management

  @Regression
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwitch" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Sandwitch" should be added

  @SystemTesting
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Salad" and price 15
    When I add that menu item
    Then Menu item with name "Cucumber Salad" should be added

  @UnitTesting
  Scenario: Add a menu item
    Given I have a menu item with name "Chicken Sandwich" and price 15
    When I add that menu item
    Then Menu item with name "Chicken Sandwich" should be added