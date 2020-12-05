/*package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepWithMapDefinition {
	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\Aug_2020_Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
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
	public void user_enters_email_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {

			driver.findElement(By.name("email")).sendKeys(data.get("email"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));

		}

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

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Deals']")).click();

		driver.findElement(By.xpath("//i[@class='edit icon']")).click(); // new deal

	}

	@Then("^user enters the deal details$")
	public void user_enters_the_deal_details(DataTable dealData) throws InterruptedException {
		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {

			driver.findElement(By.name("title")).sendKeys(data.get("title"));
			driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.name("commission")).sendKeys(data.get("commission"));

			driver.findElement(By.xpath("//i[@class='save icon']")).click(); // save button

			// move to new deal page:
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Deals']")).click();

			driver.findElement(By.xpath("//i[@class='edit icon']")).click(); // new deal

		}

	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
*/