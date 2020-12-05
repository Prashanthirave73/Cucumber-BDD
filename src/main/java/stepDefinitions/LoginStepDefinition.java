package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\Nov_86_2020_Chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		System.out.println("hello");

	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		

	}

	
	  @Then("^user enters email and password$") 
	  public void user_enters_email_and_password() {
	  
	  driver.findElement(By.name("email")).sendKeys("prashanthirave86@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("P9096960753");
	  
	  }
	 
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String email, String password) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user click on Login$")
	public void user_click_on_Login() {
		driver.findElement(By.xpath("//div[@class=\"ui fluid large blue submit button\"]")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String Taital = driver.getTitle();
		System.out.println(Taital);
		Assert.assertEquals("Cogmento CRM", Taital);

	}

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();

	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String position) {
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();//new contacts
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='position']")).sendKeys(position);
		
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();//save contact
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
	

}
