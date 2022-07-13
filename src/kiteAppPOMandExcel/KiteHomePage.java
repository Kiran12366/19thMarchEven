package kiteAppPOMandExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOutButton;

	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void validateUserID(String uid) {
		String ExpectedUserID = uid;
		String ActualUserID = UserID.getText();

		if (ExpectedUserID.equals(ActualUserID)) {
			System.out.println(" ExpectedUserID matches ActualUserID and TC is passed ");
		} else {
			System.out.println(" ExpectedUserID not  matches ActualUserID and TC is fail");
		}

	}

	public void clickOnlogOut() throws InterruptedException {
		UserID.click();
		Thread.sleep(1000);
		LogOutButton.click();
	}
}
