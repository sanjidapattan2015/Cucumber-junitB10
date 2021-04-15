package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;
	
	@Given("I am able to navigate onto the login page")
	public void i_am_able_to_navigate_onto_the_login_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SanjidaPattan\\Desktop\\Sanjida\\SDET\\chromedriver.exe");
	    driver = new ChromeDriver(); //to open browser
	    driver.get("https://opensource-demo.orangehrmlive.com/"); //to open application url
	    driver.manage().window().maximize(); //to maximize window
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //to wait for sometime
	}
	
	@When("I Enter the username as {string}")
	public void i_enter_the_username_as(String string) {
	    driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("I Enrer the Password as {string}")
	public void i_enrer_the_password_as(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("I Click on the Login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
	    String name = driver.findElement(By.id("welcome")).getText();
	    String Actualdata = string;
	    Assert.assertEquals(name, Actualdata);
	    System.out.println("Login successful");
	    Thread.sleep(3000);
	    driver.close();
	}

	@Then("I should see a Error Message as {string}")
	public void i_should_see_a_error_message_as(String string) throws InterruptedException {
		String actualerr = driver.findElement(By.id("spanMessage")).getText();
		String expectederr = "Invalid credentials";
		Assert.assertEquals(expectederr, actualerr);
	    driver.close();
	}

	
}
