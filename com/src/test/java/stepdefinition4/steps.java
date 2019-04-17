package stepdefinition4;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class steps {
	WebDriver driver;
	
	@Before public void setUp(){ 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1034155\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	   } 
	
	

	@Given("^Enter the user details and click on sign in button$")
	public void enter_the_user_details_and_click_on_sign_in_button(DataTable arg1) throws Throwable {
		Map<String, String> cells = arg1.asMap(String.class, String.class);
		String accountid=cells.get("accountid").trim();
		String customer_firstname=cells.get("customer_firstname").trim();
		String customer_lastname=cells.get("customer_lastname").trim();
		String password=cells.get("password").trim();
		String firstname=cells.get("firstname").trim();
		String lastname=cells.get("lastname").trim();
		String address1=cells.get("address1").trim();
		String city=cells.get("city").trim();
		String postcode=cells.get("postcode").trim();
		String phone=cells.get("phone").trim();
		
		driver.findElement(By.xpath("//*[contains(text(), 'Sign in')]")).click();
		
		driver.findElement(By.id("email_create")).sendKeys(accountid);
		driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).click();
		
		
		Thread.sleep(6000);
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys(customer_firstname);
		
		driver.findElement(By.id("customer_lastname")).sendKeys(customer_lastname);
		driver.findElement(By.id("passwd")).sendKeys(password);
		//driver.findElement(By.id("firstname")).sendKeys(firstname);
		
		//driver.findElement(By.id("lastname")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address1);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.xpath("//*[@id='id_state']/option[3]")).click();
		
		driver.findElement(By.id("postcode")).sendKeys(postcode);
		driver.findElement(By.id("phone_mobile")).sendKeys(phone);
		driver.findElement(By.xpath("//*[contains(text(), 'Register')]")).click();
	}

	@Then("^Registration should be successful$")
	public void registration_should_be_successful() throws Throwable {
		if(driver.getPageSource().contains("Welcome to your account"))
		{
		System.out.println("Registration Successful");
		}
	}
	@After public void cleanUp(){ 
	      driver.close(); 
	   } 
}
