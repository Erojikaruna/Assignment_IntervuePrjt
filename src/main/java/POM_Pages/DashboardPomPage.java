package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPomPage {

	    //Declare
		@FindBy(linkText="Internal interviews platform")
		private WebElement InternalLink;
		
		@FindBy(xpath="//span[@class='search_placeholder']")
		private WebElement searchField;
		
		@FindBy(xpath="//input[@placeholder='Type what you want to search for']")
		private WebElement InputField;
		
		@FindBy(xpath="//span[text()='hello']")
		private WebElement value;
		
		@FindBy(xpath="//div[text()='N']")
		private WebElement profileicon;
		
		@FindBy(linkText="Logout")
		private WebElement logout;
		
		// Initialization
		public DashboardPomPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//Utilization 
		
		public void getInternalLink() {
			 InternalLink.click();
		}

		public void getSearchField() {
			 searchField.click();
		}

		public void getInputField() {
			 InputField.sendKeys("hello");
		}

		public void getValue() {
			value.click();
		}

		public void getProfileicon() {
			 profileicon.click();
		}

		public void getLogout() {
			 logout.click();
		}
		
		
}
