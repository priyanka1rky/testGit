package pageAction;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import genericLib.propertyhelper;
import genericLib.testBase;

public class cookie extends testBase {
	@Test
	public void ctest() throws IOException
	{
		propertyhelper h1= new propertyhelper();
	
		testBase c1=new testBase();
		c1.launchBrowser("Chrome");
		driver.get("https://www.facebook.com/");
		driver.get(h1.getvalue("fbURL"));
		
		
		
		Set<Cookie> ck =driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie ec:ck)
		{
			
		
		}
		driver.manage().deleteAllCookies();
		Set<Cookie> dk =driver.manage().getCookies();
		System.out.println(dk.size());
		
		
	
	}
	
	

}
