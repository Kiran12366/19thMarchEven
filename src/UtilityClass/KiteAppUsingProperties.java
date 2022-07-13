package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class KiteAppUsingProperties {

	public static String getDatafromPropertyfile(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				"F:\\Javaworkspace\\AutomationTesting\\src\\KiteAppProperties.properties");
		prop.load(data);
		String value = prop.getProperty(key);
		return value;
	}

	public static void getScreenShot(WebDriver driver, String tcid) throws IOException {

//	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File des=new File("F:\\Automation testing\\Screenshot"+tcid+".png");
//	FileHandler.copy(src, des);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		System.out.println(src);

		File des = new File("F:\\Automation testing\\Screenshot\\amazonimg" + tcid + ".png");

		FileHandler.copy(src, des);
	}

}