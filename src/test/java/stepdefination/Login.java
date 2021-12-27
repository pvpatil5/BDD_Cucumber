package stepdefination;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	WebDriver driver;

	@Given("launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("enter URL")
	public void enter_url() {
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
	}

	@Then("enter username")
	public void enter_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	}

	@Then("enter password")
	public void enter_password() {
		driver.findElement(By.name("user_password")).sendKeys("12345");
	}

	@Then("click on loginbtn")
	public void click_on_loginbtn() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("Close Browser")
	public void close_browser() throws InterruptedException 
	{
		Thread.sleep(10000);
		driver.close();
	}

	@When("enter URL {string}")
	public void enter_url(String URL) {
		driver.get(URL);
	}

	@Then("enter username {string}")
	public void enter_username(String un) {
		driver.findElement(By.name("user_name")).sendKeys(un);
	}

	@Then("enter password {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}



}
