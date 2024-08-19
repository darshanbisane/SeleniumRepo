package stepdef;

import static org.testng.Assert.assertTrue;

//import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlestepdef
{
	public WebDriver driver;
	public String actT;
	@Given("Open the google application")
	public void open_the_google_application()
	{
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	}

	@When("User capture curent page title")
	public void user_capture_curent_page_title()
	{
	    String expT = "Google";
	    String actT = driver.getTitle();
	}

	@Then("Title Should match")
	public void title_should_match() 
	{
		 Assert.assertEquals(actT.contains("Google")," ");
		//Assert.assertTrue(actT.concat("google"), "");
		 System.out.println("Title is match Tc is passed");
	}
}

// I am test lead from gitup
