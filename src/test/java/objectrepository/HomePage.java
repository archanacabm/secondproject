package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	By homeButton = By.xpath("//span[text()=\"Home\"]");

	public WebElement homeButton() {
		return driver.findElement(homeButton);
	}

}
