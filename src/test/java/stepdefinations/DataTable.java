package stepdefinations;


import java.util.List;
import java.util.Map;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable {

	 @Given("^I placed an order for the following items$")
	    public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
	       
		 List <Map <String, String>> BillData = dataTable.asMaps(String.class, String.class);
	    }

	    @When("^I generate the bill$")
	    public void i_generate_the_bill()  {
	        throw new PendingException();
	    }

	    @Then("^A billl for $40 should be generated$")
	    public void a_billl_for_40_should_be_generated()  {
	        throw new PendingException();
	    }

}
