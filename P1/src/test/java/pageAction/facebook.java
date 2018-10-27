package pageAction;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLib.propertyhelper;
import genericLib.testBase;

public class facebook extends testBase{
	
	@Test
	public void link() throws IOException
	{
		
		propertyhelper u1=new propertyhelper();
		testBase t1=new testBase();
		t1.launchBrowser("chrome");
		
		driver.get("https://www.facebook.com/");
		
		List <WebElement> objLinks=driver.findElements(By.tagName("a"));
		for( WebElement currentl:objLinks)
		{
			String s =currentl.getText();
			System.out.println(s);
			
			
			
			
		}
		
		
	}
	

}
