package KiteApp_POM_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage {

	@FindBy(xpath = "//span[@class='user-id']")private WebElement Userid;
	@FindBy(xpath ="//a[@target='_self']")private WebElement LogoutBUtton;

	public Kite_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//method
	public void ClickOnUserId() throws InterruptedException {
		String ExpectedUserid = "ELR321";
		String ActualUserId = Userid.getText();
		if (ExpectedUserid.equals(ActualUserId)) {
			System.out.println("ExpectedUserid  and ActualUserId is Matching and TC is pass");

		} else {
			System.out.println("ExpectedUserid  and ActualUserId is NOT  Matching and TC is fail");
		}
		
		Userid.click();
		
		Thread.sleep(1000);
	}
	
	
	
	public void ClickOnLogOutButton() {
		LogoutBUtton.click();
	}

}
