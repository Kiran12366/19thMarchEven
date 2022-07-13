package selenium_Work_Space;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webdrivermethods {

	public static void main(String[] args) {
	
		//get
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		//maximize and
		//driver.manage().window().maximize();
		
		// minimize
		//driver.manage().window().minimize();
		
		//navigate
		//driver.navigate().to("https://www.discoveryplus.in/home?gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnECDP6LKZPIRc7klu66vDomU6W7DiCR5NolWDg42HLYEd-vnXkNwkkaAq6WEALw_wcB");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//getTitle
//		String url=driver.getTitle();
//		System.out.println(url);
		
		//getCurrenturl
//	String getcurrenturl= driver.getCurrentUrl();
//	System.out.println(getcurrenturl);
	
		//close
	//	driver.close();
		
		//quit
		//driver.quit();
		
	    
		
		
		
		
		
	}

}
