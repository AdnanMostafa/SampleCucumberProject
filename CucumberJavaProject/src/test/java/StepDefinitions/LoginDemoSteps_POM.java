package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;

public class LoginDemoSteps_POM {

//	WebDriver driver = null;
//	loginPage login;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		// ChromeDriver setup along with timeouts and window.maximize
//		System.out.println("I am inside LoginDemoSteps");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.get("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		// Write code here that turns the phrase above into concrete actions
//		login = new loginPage(driver);
//		
//		login.enterUsername(username);
//		
//		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//		// Write code here that turns the phrase above into concrete actions
//		login.clickLogin();
//		//driver.findElement(By.xpath("//button[@id='login']")).click();
//		
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//		
//		login.checkLogOutIsDisplayed();
//		// driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed();
//		
//		Thread.sleep(2000);
//
//		driver.close();
//		driver.quit();
//	}

}
