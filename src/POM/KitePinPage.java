package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
  @FindBy(id="pin") private WebElement Pin;
  @FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
  
  //constructor
  public  KitePinPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  //method
  public void sendPin(String pin) {
	  Pin.sendKeys(pin);
  }
  public void clickOnContinueButton( ) {
	  ContinueButton.click();
  }
}
