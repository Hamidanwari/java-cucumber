package Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RestaurantSystemHooks {
	
	@Before ("@Regression")
	public void BeforeDisplayMessage(Scenario sc){
		System.out.println("Executing --> Before Hooks: " + sc.getName());
	}
	
	@After ("@Regression")
	public void AfterDisplayMessage(Scenario sc){
		System.out.println("Ending --> After Hooks: " + sc.getStatus());
	}
	
}
