package kiteAppPOMandExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteAppTestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-Notiications");
		option.addArguments("--incognito");
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		File f = new File("F:\\excel\\Account.xlsx");
		Sheet mySheet = WorkbookFactory.create(f).getSheet("sheet1");
		String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		String Pin = mySheet.getRow(0).getCell(2).getStringCellValue();

		Thread.sleep(1000);
		KiteLoginPage login = new KiteLoginPage(driver);
		login.SendUserName(UN);
		login.SendPasWord(PWD);
		login.ClickOnLoginButton();

		Thread.sleep(1000);
		KitePinPage pinn = new KitePinPage(driver);
		pinn.SendPin(Pin);
		pinn.ClickOnContinueButton();

		Thread.sleep(1000);
		KiteHomePage home = new KiteHomePage(driver);
		home.validateUserID(UN);
		Thread.sleep(1000);
		home.clickOnlogOut();

//		Thread.sleep(1000);
//		driver.close();
	}

}
