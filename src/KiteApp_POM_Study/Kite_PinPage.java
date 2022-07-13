package KiteApp_POM_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PinPage {
	//variable
	@FindBy(id = "pin") private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	//constructor
	
	public Kite_PinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void SendPin() {
		Pin.sendKeys("982278");
	}
	public void ClickOnContinueButton() {
		ContinueButton.click();
	}
	
}
