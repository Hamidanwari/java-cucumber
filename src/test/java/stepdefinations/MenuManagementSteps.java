package stepdefinations;


import FalconCucumberFrameWork.CucumberFrame.RestaurantMenu;
import FalconCucumberFrameWork.CucumberFrame.RestaurantMenuItem;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuManagementSteps {
	
	RestaurantMenuItem NewMenuItem; 
	RestaurantMenu LocationMenu = new RestaurantMenu(); 
	
	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price (String NewMenuItemName, int price) {
	    // Write code here that turns the phrase above into concrete actions
		
		NewMenuItem = new RestaurantMenuItem (NewMenuItemName,"newMenuItem" , price);
		
		//System.out.println("This is step 1");
	}

	@When("I add that menu item")
	public void i_add_that_menu_item ()  {
	    // Write code here that turns the phrase above into concrete actions
		LocationMenu.addMenuItem(NewMenuItem);
		//System.out.println("This is step 2");
	}

	@Then("Menu item with name {string} should be added") 
	public void menu_item_with_name_should_be_added (String string)  {
	    // Write code here that turns the phrase above into concrete actions
	  boolean exists = LocationMenu.doesItemExist(NewMenuItem); 
	 // System.out.println("This is step 3");
	}

}
