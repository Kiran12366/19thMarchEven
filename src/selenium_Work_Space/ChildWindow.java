package selenium_Work_Space;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String mainPageID = driver.getWindowHandle();
		System.out.println(mainPageID);
		driver.findElement(By.name("NewWindow")).click();

		Set<String> AllpageID = driver.getWindowHandles();

		Iterator<String> it = AllpageID.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
		String mainPageId = it.next();// will return main page id
		String childPageId = it.next();
		driver.switchTo().window(childPageId);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		driver.switchTo().window(mainPageId);
		WebElement s = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(s.getText());
		// driver.close();
		driver.quit();

	}

}
