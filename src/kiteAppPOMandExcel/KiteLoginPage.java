package kiteAppPOMandExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	
   @FindBy(id = "userid") private WebElement UserName;
   @FindBy(id="password") private WebElement  PassWord;
   @FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
   
   public KiteLoginPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   
   
   public void SendUserName(String username) {
	   
	   UserName.sendKeys(username);
   }
   public void SendPasWord(String password) {
	   
	   PassWord.sendKeys(password); 
	   
   }
   public void ClickOnLoginButton() {
	   LoginButton.click();
   }
}
