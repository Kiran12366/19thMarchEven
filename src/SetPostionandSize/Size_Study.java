package SetPostionandSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/");
		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(600,300);
		
		driver.manage().window().setSize(d);

	}

}
