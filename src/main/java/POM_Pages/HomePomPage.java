package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePomPage {
	
    //Declare
	@FindBy(id= "iv-homepage-root")
	private WebElement header;
	
	@FindBy(id="products")
	private WebElement products;
	
	@FindBy(id="solutions")
	private WebElement solutions;
	
	@FindBy(id="pricing")
	private WebElement pricing;
	
	@FindBy(id="resources")
	private WebElement resources;
	
	@FindBy(id="contact-us")
	private WebElement contactus;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;

	// Initialize
	public HomePomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilize
	public void getlogin() {
		 login.click();
	}
	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getSolutions() {
		return solutions;
	}

	public WebElement getPricing() {
		return pricing;
	}
	
	public WebElement getResources() {
		return resources;
	}

}
