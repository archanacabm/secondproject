package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.HomePage;
import objectrepository.LoginPage;

public class LoginTest {
	WebDriver driver;

	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.salesforce.com/");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.emailField().sendKeys("archana.cabm@gmail.com");
		loginpage.passwordField().sendKeys("Anika#2019");
		loginpage.loginButton().click();
		HomePage homepage = new HomePage(driver);
		Assert.assertTrue(homepage.homeButton().isDisplayed());

	}

	@AfterMethod
	private void closure() {
		driver.close();
	}

}
