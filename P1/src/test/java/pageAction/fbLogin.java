package pageAction;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.Xls_Reader;
import genericLib.propertyhelper;
import genericLib.testBase;
import objectRepository.find;

public class fbLogin extends testBase{
	@Test
	public void facebook() throws Exception {
		/*System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();*/
		/*FileInputStream fs=new FileInputStream ("C:\\Users\\ravie\\workspace\\P1\\src\\main\\java\\genericLib\\config.properties");
		Properties prop=new Properties();
		prop.load(fs);*/
		propertyhelper u1=new propertyhelper();
		testBase t1=new testBase();
		Xls_Reader x1=new Xls_Reader("C:\\Users\\ravie\\workspace\\P1\\User.xlsx");
		t1.launchBrowser("chrome");
		
		
		driver.get(u1.getvalue("fbURL"));
		/*t1.takeSnapShot("fblogin");
		t1.setAction(driver.findElement(By.id("email")), "priyanka.rpy@gmail.com");
	
		t1.setAction(driver.findElement(By.name("pass")), "123");
		t1.setClick(driver.findElement(By.xpath("//*[@id='u_0_2'])")));
		
		t1.takeSnapShot("fbafterlogin");*/
		/*driver.switchTo().frame("packageFrame");
		t1.setClick(driver.findElement(By.linkText("com.thoughtworks.selenium.condition")));
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageListFrame");
		t1.setClick(driver.findElement(By.linkText("com.thoughtworks.selenium")));
		driver.switchTo().defaultContent();
		
		WebElement myframe=driver.findElement(By.xpath("//frame[@ name='classFrame']"));
		driver.switchTo().frame(myframe);
		
		
		driver.findElement((By.id("email"))).sendKeys("priyanka.rpy@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1Softwarepriya");*/
		//Creating object for the class Page factory
		find fb1=PageFactory.initElements(driver, find.class);
		/*waituntil(fb1.username);
		setAction(fb1.username,"priyanka.rpy@gmail.com");
		setAction(fb1.password,"123456678");
		waitclick(fb1.login);
		setClick(fb1.login);
		
		selectdropdown(fb1.Day,"4","Byindex");*/
		setAction(fb1.firstname,x1.getCellData("Sheet1","FirstName" , 1));
		String s= fb1.Create.getText();
		x1.setCellData("Sheet1", "Title", 1,s);
}
}
