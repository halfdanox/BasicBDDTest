package modules;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageobjects.LoginPage;
import modules.ImageUpload;

public class ImageUpload {

  public static void Execute(WebDriver driver) throws Exception {


    LoginPage.addImage.sendKeys("C:\\Users\\DELL-E5570\\Downloads\\cucumber-jvm-template-master\\src\\test\\resources\\testData\\testFile.png");
    Log.info("Clicked the image");
    Thread.sleep(10000);
    //Enough time to upload file

  }
}
