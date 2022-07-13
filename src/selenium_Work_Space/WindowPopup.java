package selenium_Work_Space;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.switchTo().window("windowButton");
	String mainpageid =driver.getWindowHandle();
	
	//if i want ids of all browser
	Set<String> childpageids = driver.getWindowHandles();
	ArrayList al=new ArrayList(childpageids);
	System.out.println(al.get(0));
	System.out.println(al.get(1));
	}

}
