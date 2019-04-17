package stepdefinition4;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class stepdef {
	WebDriver driver;
	 
	@Given("^Open the  site URL$")
	public void open_the_site_URL() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1034155\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.airasia.com/en/home.page");
		String Website_actual_title,Website_expected_title;
		Website_actual_title=driver.getTitle();
		Website_expected_title="AirAsia | Booking | Book low fare online";
		if(Website_actual_title == Website_actual_title)
		System.out.println("Title="+Website_actual_title+"-Title matches");
		Thread.sleep(3000);
		
		if(driver.getPageSource().contains("Find flights"))
		{
		driver.findElement(By.xpath("//*[contains(text(), 'Find flights')]")).click();
		}
	
		
	}

	@Given("^Enter the below details and click on search button$")
	public void enter_the_below_details_and_click_on_search_button(DataTable arg1) throws Throwable {
		Map<String, String> cells = arg1.asMap(String.class, String.class);
		String origin=cells.get("origin").trim();
		String Destination=cells.get("Destination").trim();
		String date=cells.get("date").trim();
		driver.findElement(By.xpath("//*[@id='wcaMainContent']/div[2]/form/div[1]/div[1]/div/div[1]/airasia-destination-autocomplete/div/div/label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='home-origin-autocomplete-heatmap']")).sendKeys(origin+Keys.RETURN);
		
		driver.findElement(By.xpath("//*[@id='wcaMainContent']/div[2]/form/div[1]/div[1]/div/div[2]/airasia-destination-autocomplete/div/div/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='home-destination-autocomplete-heatmap']")).sendKeys(Destination);
		driver.findElement(By.xpath("//*[@id='home-destination-autocomplete-heatmap']")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.id("home-depart-date-heatmap")).click();
		driver.findElement(By.id("home-depart-date-heatmap")).clear();
		driver.findElement(By.id("home-depart-date-heatmap")).sendKeys(date+Keys.RETURN);
		driver.findElement(By.id("home-depart-date-heatmap")).click();
		
		driver.findElement(By.xpath("//*[@id='wcaMainContent']/div[2]/form/div[1]/div[2]/airasia-airasia-calendar/div[1]/div[2]/div[1]/div/div[1]/div[2]/label")).click();
		driver.findElement(By.id("home-flight-search-airasia-button-inner-button-select-flight-heatmap")).click();
		
		
	}

	@Then("^I should be navigated successfully to search flight page$")
	public void i_should_be_navigated_successfully_to_search_flight_page() throws Throwable {
	    System.out.println("Search Flights page is Successfully displayed ");
	}
	
	@Given("^Enter the below details and click on login button$")
	public void enter_the_below_details_and_click_on_login_button(DataTable arg1) throws Throwable {
		
		Map<String, String> cells = arg1.asMap(String.class, String.class);
		String username=cells.get("username").trim();
		String password=cells.get("password").trim();
		driver.findElement(By.xpath("//*[@id='header']/div/div[8]/span")).click();
		driver.findElement(By.xpath("//*[@id='username-input--login']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password-input--login']")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
	
	}

	@Then("^Login unsuccessful message should be displayed$")
	public void login_unsuccessful_message_should_be_displayed() throws Throwable {
	  System.out.println("log in attempt has been unsuccessful");
	}

	@Given("^Open the  demotours URL$")
	public void open_the_demotours_URL() throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1034155\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.xpath("//*[contains(text(), 'REGISTER')]")).click();
	}

	@Given("^Enter the user details and click on register button$")
	public void enter_the_user_details_and_click_on_register_button(DataTable arg1) throws Throwable {
		Map<String, String> cells = arg1.asMap(String.class, String.class);
		String firstName=cells.get("firstName").trim();
		String lastName=cells.get("lastName").trim();
		String phone=cells.get("phone").trim();
		String userName=cells.get("userName").trim();
		String address1=cells.get("address1").trim();
		String city=cells.get("city").trim();
		String state=cells.get("state").trim();
		String postalCode=cells.get("postalCode").trim();
		String email=cells.get("email").trim();
		String password=cells.get("password").trim();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address1);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalCode);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(31000);
	}

	@Then("^Registration successful message should be displayed$")
	public void registration_successful_message_should_be_displayed() throws Throwable {
	    System.out.println("Registration successful");
	}

	
}
