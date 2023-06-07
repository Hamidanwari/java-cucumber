package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Score {

	@Given("I am Bating")
	public void i_am_bating() throws Throwable {
		System.out.println("I am bating");
	}

	@Then("The balls he played (Balls)")
	public void the_balls_he_played(String balls) throws Throwable {
		System.out.println("The ball he played");
	}

	@And("The batsman name (NameOfBatsman)")
	public void the_batsman_name(String nameofbatsman) throws Throwable {
		System.out.println("The batsman name");
	}

	@And("The score (Score)")
	public void the_score(String score) throws Throwable {
	    System.out.println("The score");

	}
}
