package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {
	
	ChromeDriver driver;
	
	@Given("Launch chrome browser and load url")
	public void launchChromeBrowserAndLoadUrl() {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
				
	}

	@Given("enter username as (.*)")
	public void enterUsernameAsDemosalesmanager(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}

	@Given("enter password as (.*)")
	public void enterPasswordAsCrmsfa(String pwd) {
	    driver.findElementById("password").sendKeys(pwd);
	}

	@When("click login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("its navigated Homepage")
	public void itsNavigatedHomepage() {
	   System.out.println(driver.getTitle());
	}

	@Then("click the logout button")
	public void clickTheLogoutButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	
	}
	@Then("close browser")
	public void closeBrowser() {
	    driver.close();
	}

	@Given("enter username as emon")
	public void enterUsernameAsEmon() {
		driver.findElementById("username").sendKeys("emon");
	}

	@Then("its navigated Samepage")
	public void itsNavigatedSamepage() {
	   System.out.println(driver.getTitle());
	}

	@Then("verify error message")
	public void verifyErrorMessage() {
		String text = driver.findElementById("errorDiv").getText();
		if(text.contains("The Following Errors Occurred:")) {
			System.out.println("The given credential is wrong");
		}
	   
	}



}
