package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginDetailPomPage {

	        //Declaration
	         @FindBy(xpath="iv-homepage-root")
	         private WebElement header;
			
			@FindBy(id="login_email")
			private WebElement email_TF;
			
			@FindBy(id="login_password")
			private WebElement password_TF;
			
			@FindBy(xpath="//span[text()='Login with email']")
			private WebElement loginwithEmail_button;
			
			
			//Initialize
			public loginDetailPomPage (WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//Utilization

			public String getHeader() {
				return header.getText();
			}

			public void getemial_TF(String workemail) {
				email_TF.sendKeys(workemail);;
			}

			public void getpassword_TF(String password) {
				password_TF.sendKeys(password);;
			}
			
			public WebElement getloginwithEmail_button() {
				return loginwithEmail_button;
			}
}
