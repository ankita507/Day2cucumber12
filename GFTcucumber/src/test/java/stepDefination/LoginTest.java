package stepDefination;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



//DAY1 
public class LoginTest {
    PageObjects po;
	public static WebDriver driver;
	@Given("^Navigate to Home Page$")
	public void wheniamonhomepage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		po = new PageObjects(driver);
		
	}
	@When("^User enters username and password$")
	public void whenienterusernameandpassword()
	{
		po.signin.click();
		po.username.sendKeys("lalitha");
		po.password.sendKeys("Password123");
		po.login.click();
	}
	@Then("^User logged in successfully$")
	public void iamabletologin()
	{
		System.out.println("Login successful");
		
	}
	//second code for data table
	@When("^Lalitha searches below products in the search box:$")
	public void Lalitha_searches_below_products_in_the_search_box(DataTable dataTable)
	{    
		List<String> list = dataTable.asList(String.class);
	
		for (String s : list) {
			
			
			driver.findElement(By.name("products")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a")).click();
			
			
			
		}
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a[2]")).click();
	
	   
	}
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterusernamepassword(String username,String password)
	{
		po.signin.click();

		po.username.sendKeys(username);

		po.password.sendKeys(password);

		po.login.click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a[2]")).click();
		
	}
	
    @Then("^product should be added in the cart if available$")
    public void product_should_be_added_in_the_cart_if_available()
    {
    	System.out.println("product added to cart");
    }
    
    //end datatable
}




