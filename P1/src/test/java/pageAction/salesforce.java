package pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLib.testBase;


public class salesforce extends testBase {
	@Test

	public void sales() throws Exception {
		/*System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();*/
		/*tsales s1 =new tsales();
		s1.bsales();*/
		
		testBase s2=new testBase();
		s2.launchBrowser("Chrome");
		driver.get("https://login.salesforce.com/");
		s2.setAction(driver.findElement(By.id("username")),"priyanka.rpy@gmail.com");
		s2.setAction(driver.findElement(By.id("password")), "135566");
		//s2.takeSnapShot("Before Login");
		s2.setClick(driver.findElement(By.id("Log")));
		//s2.takeSnapShot("After Login");

		
	
		
		/*driver.findElement((By.id("username"))).sendKeys("priyanka.rpy@gmail.com");
		driver.findElement(By.id("password")).sendKeys("p1233");
		driver.findElement(By.id("Login")).click();
*/
	}

}
