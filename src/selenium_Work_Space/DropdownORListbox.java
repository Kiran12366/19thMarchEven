package selenium_Work_Space;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownORListbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
	 
	WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.id("month"));
	Thread.sleep(2000);
	WebElement year = driver.findElement(By.id("year"));
	Thread.sleep(2000);
	Select s=new Select(dob);
	Thread.sleep(2000);
	Select s1=new Select(month);
	Thread.sleep(2000);
	Select s2=new Select(year);
	Thread.sleep(1000);
	s.selectByVisibleText("1");
	Thread.sleep(2000);
	s1.selectByIndex(3);
	Thread.sleep(3000);
	s2.selectByValue("1996");
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
