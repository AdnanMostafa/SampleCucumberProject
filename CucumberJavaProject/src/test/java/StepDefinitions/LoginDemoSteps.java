package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		// ChromeDriver setup along with timeouts and window.maximize
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://example.testproject.io/web/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Adnan");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");

	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id='login']")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed();

		driver.close();
		driver.quit();
	}

}
