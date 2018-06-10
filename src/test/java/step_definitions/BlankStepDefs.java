package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BlankStepDefs{
    public WebDriver driver;
    
    public BlankStepDefs()
    {
    	driver = Hooks.driver;
    }
    
    @When("^I open image galery website$")
    public void i_open_seleniumframework_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://basitali.github.io/test_gallery/dist/");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      assertEquals("Image Gallery / Test Project by Andrei Varapayeu",driver.getTitle());
      assertEquals("https://basitali.github.io/test_gallery/dist/",driver.getCurrentUrl());
    }
    
}