package GenericUtilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {
	WebDriver driver = null;

	public void maximizeTheWindow(WebDriver driver) {

		driver.manage().window().maximize();
	}

	public void waitTillElementFound(String timeOuts, WebDriver driver) {
		long time = Long.parseLong(timeOuts);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}

	public void navigateToAnAppl(WebDriver driver, String url) {

		driver.get(url);
	}
	
	public void Action_MouseHoveringToProducts(WebDriver driver, WebElement products) {
		Actions act = new Actions(driver);
		act.moveToElement(products).perform();
	}
	
	public void Action_MouseHoveringToSolutions(WebDriver driver, WebElement solutions) {
		Actions act = new Actions(driver);
		act.moveToElement(solutions).perform();
	}
	
	public void Action_MouseHoveringToPricing(WebDriver driver, WebElement pricing) {
		Actions act = new Actions(driver);
		act.moveToElement(pricing).perform();
	}
	
	public void Action_MouseHoveringToResources(WebDriver driver, WebElement resources) {
		Actions act = new Actions(driver);
		act.moveToElement(resources).perform();
	}
	
	public void Action_MouseHoveringToContactus(WebDriver driver, WebElement contactus) {
		Actions act = new Actions(driver);
		act.moveToElement(contactus).perform();
	}
	
	public void Action_MouseHovering(WebDriver driver, WebElement button) {
		Actions act = new Actions(driver);
		act.moveToElement(button).click().build().perform();
	}
	
	public void switchToTabUsingUrl(WebDriver driver, String url) {
		Set<String> wids = driver.getWindowHandles();
		for (String s : wids) {
			driver.switchTo().window(s);
			if(driver.getCurrentUrl().contains(url)) {
			break;
			}
	}
		
	}
	
	public void QuitTheBrowser(WebDriver driver) {
		driver.quit();
	}

}
