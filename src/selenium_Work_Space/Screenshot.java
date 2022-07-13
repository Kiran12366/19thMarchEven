package selenium_Work_Space;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
       File  src	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
       System.out.println(src);
       String str=RandomString.make(3);
	
       File des=new File("F:\\Automation testing\\Screenshot\\amazonimg"+str+".png");
       
	FileHandler.copy(src, des);
	}

}
