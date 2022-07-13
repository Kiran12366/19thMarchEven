package Miscelleous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> unorderedlist = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		Thread.sleep(1000);
		System.out.println(unorderedlist.size());
		Thread.sleep(1000);
		for (WebElement u : unorderedlist) {

			String expected = u.getText();
			String actual = "honda amaze";
			Thread.sleep(1000);
			if (expected.equals(actual)) {
				u.click();
				break;
			}
		}

	}

}
