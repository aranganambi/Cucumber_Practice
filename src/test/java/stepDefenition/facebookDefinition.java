package stepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import baseClass.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class facebookDefinition {
	WebDriver driver;
	
	@Given("User launching URL {string}")
	public void user_launching_url(String url) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("User entering username {string}")
	public void user_entering_username(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	}
	@When("User entering password {string}")
	public void user_entering_password(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	@When("User clicking login button")
	public void user_clicking_login_button() {
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login button clicked successfully");
	}
	@Then("User validating sucessfully logedin or not")
	public void user_validating_sucessfully_logedin_or_not() {
	    boolean text = driver.findElement(By.xpath("//span[text()='Your Pages and profiles']")).isDisplayed();
	    Assert.assertEquals(true, text);
	    System.out.println(text);
	}
}
