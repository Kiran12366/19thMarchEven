package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelKiteUserId {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		File excel=new File("F:\\excel\\Account.xlsx");
		Sheet sheet1 = WorkbookFactory.create(excel).getSheet("sheet1");
		String UN = sheet1.getRow(0).getCell(0).getStringCellValue();
		String PWD = sheet1.getRow(0).getCell(1).getStringCellValue();
		String PIN = sheet1.getRow(0).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginButton =driver.findElement(By.xpath("//button[@type='submit']"));
		userID.sendKeys(UN);
		passWord.sendKeys(PWD);
		loginButton.click();
		
		Thread.sleep(1000);
		WebElement PINN = driver.findElement(By.id("pin"));
		PINN.sendKeys(PIN);
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		ContinueButton.click();
		Thread.sleep(1000);
		
		String ExceptedUserId=UN;
		String ActualUserId="ELR321";
		if(ExceptedUserId.equals(ActualUserId)) {
			System.out.println("match");
		}
		else {
			System.out.println("not match");
		}
		WebElement uid = driver.findElement(By.xpath("//span[@class='user-id']"));
		uid.click();
		
		Thread.sleep(1000);
		
		WebElement Logout = driver.findElement(By.xpath("//a[@target='_self']"));
		Logout.click();
		
		
		
		
		
		
		
	}

}
