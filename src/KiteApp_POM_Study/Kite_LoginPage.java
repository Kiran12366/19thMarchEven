package KiteApp_POM_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage {

//variable 	
@FindBy(id="userid") private WebElement userid;
@FindBy(id="password")  private WebElement password;
@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;


//constructor
public  Kite_LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
}




//method
public void SendUserName() {
	userid.sendKeys("ELR321");
}
public void SendPasWord() {
	password.sendKeys("Dhana1111");
}
public void ClickOnLoginButton() {
	LoginButton.click();
	
}

	
	
	
}
