package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import modules.SignInAction;
import modules.ImageUpload;
import modules.VerifyImage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ImageGallery {
    public WebDriver driver;
//    public List<HashMap<String,String>> datamap = DataHelper.data();
    public static List<HashMap<String,String>> datamap = null;
    
    
    public ImageGallery()
    {
    	driver = Hooks.driver;
    	
    	datamap = new ArrayList<HashMap<String,String>>();
    	HashMap<String,String> sampleData = new HashMap<String,String>();
    	sampleData.put("username","abc@xyz.com");
    	sampleData.put("password","Test@123");
    	System.out.println("Current data" +sampleData);
    	datamap.add(sampleData);
    }
    
    @When("^I open automationpractice website$")
    public void i_open_automationpractice_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.get("https://basitali.github.io/test_gallery/dist/");
    }

    @When("^I upload image$")
    public void i_upload_images() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      // PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, LoginPage.class);

		ImageUpload.Execute(driver);

		//SignInAction.Execute(driver,datamap.get(0));
    }

    @Then("^I see the image is loaded$")
    public void i_sign_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	VerifyImage.Execute(driver);
    }
    
}