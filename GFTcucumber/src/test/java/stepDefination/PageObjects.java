package stepDefination;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	WebDriver driver;
	public PageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);    //inilization 
	}
	
	@FindBy(xpath="//a[@href='login.htm']")
	public  WebElement signin;         
	
	@FindBy(name="userName")
	public  WebElement username;
	
	@FindBy(name="password")
	public  WebElement password;
	
	@FindBy(name="Login")
	public  WebElement login;
	
	/*@FindBy(name="products")
	public static WebElement search;
	
	@FindBy(name="val")
	public static WebElement find;
	
	@FindBy(xpath="//a[@href='#']")
	public static WebElement cart;*/
	

}
