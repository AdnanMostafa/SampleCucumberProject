package StepDefinitions;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;



public class GoogleSearchSteps {
	
	WebDriver driver=null;
	
	public void browser_setup() {
	WebDriverManager.chromedriver().setup();
	}
	
	@Given("browser is open")
	public void browser_is_open() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("adnan mostafa");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		//driver.getPageSource().contains("Adnan Mostafa - QA Automation Lead - FedEx");
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/in/adnanmostafa']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}

}
