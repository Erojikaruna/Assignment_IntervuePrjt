package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPomPage {

	// Declaration
		@FindBy(id= "iv-homepage-root")
		private WebElement header;
		

		@FindBy(xpath = "(//div[text()='Login'])[1]")
		private WebElement login_button;
		
		// Initialize
		public loginPomPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// Utilize
		public String getHeader() {
			return header.getText();
		}

		public void getlogin_button() {
			login_button.click();
		}

}
