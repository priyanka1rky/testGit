package pageAction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.testBase;

public class launch extends testBase{
	
	@Test
	public void browser() throws IOException, InterruptedException{
		testBase t1=new testBase();
		t1.launchBrowser("chrome");
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\ravie\\Documents\\Fileupload.exe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Upload']")).click();
		
	}
	
	
	
	
	

	
	
	
	


}
