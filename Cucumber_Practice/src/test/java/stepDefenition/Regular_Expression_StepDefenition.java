package stepDefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Regular_Expression_StepDefenition {
	@Given("My name is {string}")
	public void my_name_is(String myName) {
	    System.out.println("My name is = "+myName);
	}
	@When("My Hight is {double}")
	public void my_hight_is(Double height) {
	    System.out.println("My height is = "+height);
	}
	@When("My Weight is {int} {string}")
	public void my_weight_is(Integer weight, String unit) {
	    System.out.println("My weight is = "+weight+" "+unit);
	}
	@Then("Family detais my father name is {string} mother name is {string} and sister name is {string}")
	public void family_detais_my_father_name_is_mother_name_is_and_sister_name_is(String FatherName, String MotherName, String SisterName) {
	    System.out.println("FatherName = "+FatherName);
	    System.out.println("MotherName = "+MotherName);
	    System.out.println("SisterName = "+SisterName);
	}
	
}
