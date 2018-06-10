package modules;

import helpers.Log;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import pageobjects.AutomationHomePage;
import pageobjects.LoginPage;

public class VerifyImage {

	public static void Execute(WebDriver driver) throws Exception{

		Assert.assertEquals(LoginPage.image.isDisplayed(),true);
		Log.info("image is shown");

	}
}
