package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class find {
	@FindBy(id="email")
	public WebElement username;
	@FindBy (id="pass")
	public WebElement password;
	@FindBy (xpath="//input[@value='Log In']")
	public WebElement login;
	@FindBy(id="day")
	public WebElement Day;
	@FindBy(xpath="//input[@name='firstname']")
	public WebElement firstname;
	@FindBy(xpath="//span[contains(text(),'Create an account')]")
	public WebElement Create;
	
	

}
