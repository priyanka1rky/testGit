package genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testBase {
	public static WebDriver driver;
	public  WebDriver launchBrowser(String browser) throws IOException
	
	
	{
		
		propertyhelper h1 = new propertyhelper();
		
	
		if (browser.equalsIgnoreCase("chrome"))
		
		{
			
			System.setProperty("webdriver.chrome.driver",h1.getvalue("chromedriver"));
	
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("fireforx"))
		{
		System.setProperty("webdriver.gecko.driver/", "D:\\geckodriver-v0.21.0-win64\\fireforxdriver.exe");
		driver=new FirefoxDriver();
		}
		  return driver;
	}

public void setAction(WebElement obj, String value)

{
	obj.sendKeys(value);
}
public void setClick(WebElement obj)
{
	obj.click();
}



public void takeSnapShot(String fileName) throws Exception{

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)driver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File("D:\\Screenshot\\"+fileName+".png");

            //Copy file at destination

            //FileUtils.copyFile(SrcFile, DestFile);
            FileHandler.copy(SrcFile, DestFile);

}

public void waituntil(WebElement obj)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(obj));

}
public void waitclick(WebElement obj)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(obj));
}
public void selectdropdown(WebElement Obj, String value, String Type)

{
	Select s = new Select(Obj);
	if (Type.equalsIgnoreCase("Bytext"))
	{
		s.selectByVisibleText(value);
	}
	else if (Type.equalsIgnoreCase("Byvalue"))
	{
		s.selectByValue(value);
	}
	else 
	{
		s.selectByIndex(Integer.parseInt(value));
	}
}
}

