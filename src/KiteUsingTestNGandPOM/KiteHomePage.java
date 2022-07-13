package KiteUsingTestNGandPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement UserId;
	@FindBy(xpath = "//a[@target='_self']")
	private WebElement LogoutButton;

	// constructor
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ValidateUserId(String uid) {
		String ExpectedUserId = uid;
		String ActualUserId = UserId.getText();
		if (ExpectedUserId.equals(ActualUserId)) {
			System.out.println("expected and actual userid is matching ,TC pass");

		} else {
			System.out.println("expected and actual userid is not matching ,TC is failed");
		}
	}
	// to get actual userid
	public String getActualUserId() {
		String ActualUserId = UserId.getText();
		return ActualUserId;
	}

	public void logout() throws InterruptedException {
		UserId.click();
		Thread.sleep(100);
		LogoutButton.click();
	}

}
