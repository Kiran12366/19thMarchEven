package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
 @FindBy(id = "userid") private WebElement UserId;
 @FindBy(id = "password") private WebElement Password;
 @FindBy(xpath = "//button[@type='submit']")private  WebElement LoginButton;
 //constructor
 
 public KiteLoginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
 //method
 public void sendUserId(String userid) {
	 UserId.sendKeys(userid);
 }
 public void sendUserPassword(String password) {
	 Password.sendKeys(password);
	 
 }
 public void clickOnLoginButton() {
	 LoginButton.click();;
 }
}
