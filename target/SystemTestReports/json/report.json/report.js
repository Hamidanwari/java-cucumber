$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/MenuManagment.feature");
formatter.feature({
  "name": "Menu Management",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SystemApps"
    }
  ]
});
formatter.scenario({
  "name": "Add a menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SystemApps"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber Sandwitch\" and price 20",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu item with name \"Cucumber Sandwitch\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SystemApps"
    },
    {
      "name": "@SystemTesting"
    }
  ]
});
formatter.step({
  "name": "I have a menu item with name \"Cucumber Salad\" and price 15",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu item with name \"Cucumber Salad\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SystemApps"
    },
    {
      "name": "@UnitTesting"
    }
  ]
});
formatter.step({
  "name": "I have a menu item with name \"Chicken Sandwich\" and price 15",
  "keyword": "Given "
});
formatter.match({
  "location": "MenuManagementSteps.i_have_a_menu_item_with_name_and_price(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add that menu item",
  "keyword": "When "
});
formatter.match({
  "location": "MenuManagementSteps.i_add_that_menu_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Menu item with name \"Chicken Sandwich\" should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuManagementSteps.menu_item_with_name_should_be_added(String)"
});
formatter.result({
  "status": "passed"
});
});