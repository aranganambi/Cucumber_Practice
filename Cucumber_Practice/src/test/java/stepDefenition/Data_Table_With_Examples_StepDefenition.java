package stepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Data_Table_With_Examples_StepDefenition {
	WebDriver driver;
	@Given("I am going to launching URL {string}")
	public void i_am_going_to_launching_url(String url) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("I am going to entering following credentials {string} and {string}")
	public void i_am_going_to_entering_following_credentials_and(String userName, String passWord) {
		driver.findElement(By.id("email")).sendKeys(userName);
	    driver.findElement(By.id("pass")).sendKeys(passWord);
	}
	@When("I am going to clicking login button")
	public void i_am_going_to_clicking_login_button() {
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login button clicked successfully");
	}
	@Then("I am going to validating sucessfully logedin or not")
	public void i_am_going_to_validating_sucessfully_logedin_or_not() {
		boolean text = driver.findElement(By.xpath("//span[text()='Your Pages and profiles']")).isDisplayed();
	    Assert.assertEquals(true, text);
	    System.out.println(text);
	    driver.close();
	}
}
