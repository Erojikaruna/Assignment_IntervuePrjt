package Login;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.Property_Utility;
import GenericUtilities.WebDriver_Utility;
import POM_Pages.DashboardPomPage;
import POM_Pages.HomePomPage;
import POM_Pages.loginDetailPomPage;
import POM_Pages.loginPomPage;

@Listeners(ListenersUtility.Listeners.class)
public class LoginTest {

	public static WebDriver sdriver = null;

	@Test
	public void test() throws InterruptedException, IOException {

		WebDriver_Utility w_util = new WebDriver_Utility();

		// Fetch Data from Property file
		Property_Utility pro = new Property_Utility();
		String Browser = (pro.FetchDataFromPropertyFile("Browser"));
		String url = (pro.FetchDataFromPropertyFile("url"));
		String workemail = (pro.FetchDataFromPropertyFile("workemail"));
		String password = (pro.FetchDataFromPropertyFile("password"));
		String timeouts = (pro.FetchDataFromPropertyFile("timeouts"));

		// Launch the browser
		WebDriver driver = null;
		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
		}

		sdriver = driver;
		// Maximize the window
		w_util.maximizeTheWindow(driver);

		// Implicit wait
		w_util.waitTillElementFound(timeouts, driver);

		// Navigate to an application
		w_util.navigateToAnAppl(driver, url);

		HomePomPage home = new HomePomPage(driver);

		// Mousehover on Products dropdown
		WebElement products = home.getProducts();
		w_util.Action_MouseHoveringToProducts(driver, products);

		// Mousehover on solutions dropdown
		WebElement solutions = home.getSolutions();
		w_util.Action_MouseHoveringToSolutions(driver, solutions);

		// Mousehover on pricing
		WebElement pricing = home.getPricing();
		w_util.Action_MouseHoveringToPricing(driver, pricing);

		// Mousehover on resources dropdown
		WebElement resources = home.getResources();
		w_util.Action_MouseHoveringToResources(driver, resources);

		// Mousehover on contactus
		WebElement contactus = home.getContactus();
		w_util.Action_MouseHoveringToContactus(driver, contactus);

		// Click on login button
		home.getlogin();

		// Switch the driver control to child window
		w_util.switchToTabUsingUrl(driver, "https://www.intervue.io/access-account");

		// click on login button
		loginPomPage l = new loginPomPage(driver);
		l.getlogin_button();

		// Identify email & pwd textfield and enter values
		loginDetailPomPage ldetail = new loginDetailPomPage(driver);
		ldetail.getemial_TF(workemail);
		ldetail.getpassword_TF(password);

		// Click on login with email button
		WebElement button = ldetail.getloginwithEmail_button();
		w_util.Action_MouseHovering(driver, button);

		// Verify login with email button
		if (button.getText().equals("Login with email")) {
			Reporter.log("Test Pass: Button text matches exactly", true);
		} else {
			Reporter.log("Test Fail: Expected 'Login with email' but found '" + button.getText() + "'", true);

		}

		DashboardPomPage dpage = new DashboardPomPage(driver);

		// Click on Internal interview platform link
		dpage.getInternalLink();

		Thread.sleep(3000);
		// Click on Search text field
		dpage.getSearchField();

		// Enter value in the text field
		dpage.getInputField();

		// Click on value
		dpage.getValue();

		// Click on profile icon
		dpage.getProfileicon();

		// Click on logout
		dpage.getLogout();

		// close the browser
		w_util.QuitTheBrowser(driver);
	}

}