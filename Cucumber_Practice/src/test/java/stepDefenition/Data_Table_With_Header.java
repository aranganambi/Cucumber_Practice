package stepDefenition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Data_Table_With_Header {
	WebDriver driver;
	@Given("I am launching URL {string}")
	public void i_am_launching_url(String url) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("I am entering below userName and passWord:")
	public void i_am_entering_below_user_name_and_pass_word(DataTable table) throws Throwable {
	    List<Map<String, String>> datas = table.asMaps(String.class,String.class);
	    String userName = datas.get(1).get("UserName");
	    String passWord = datas.get(1).get("PassWord");
	    driver.findElement(By.id("email")).sendKeys(userName);
	    driver.findElement(By.id("pass")).sendKeys(passWord);
	}
	
	@When("I am clicking login button")
	public void i_am_clicking_login_button() {
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Login button clicked successfully");
	}
	@Then("I am validating sucessfully logedin or not")
	public void i_am_validating_sucessfully_logedin_or_not() {
		boolean text = driver.findElement(By.xpath("//span[text()='Your Pages and profiles']")).isDisplayed();
	    Assert.assertEquals(true, text);
	    System.out.println(text);
	    driver.quit();
	}

}
