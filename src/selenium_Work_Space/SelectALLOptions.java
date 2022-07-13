package selenium_Work_Space;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class SelectALLOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "F:\\\\selenium\\\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://en-gb.facebook.com/");
 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
 Thread.sleep(1000);
WebElement sr = driver.findElement(By.id("day"));
sr.click();
 Select s =new Select(sr);
 s.selectByIndex(0);
 s.selectByValue("2");
 s.selectByVisibleText("3");
boolean st = s.isMultiple();//ismultiplle method will check wheater dropdown supports  multiple selection of option
 System.out.println(st);
// List<WebElement> allOptions = s.getOptions();
//
List<WebElement> str = s.getAllSelectedOptions();
System.out.println(str.size());
for(WebElement o:str) {
	System.out.println(o.getText());
}

 
	}

}
