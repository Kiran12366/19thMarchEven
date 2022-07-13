package selenium_Work_Space;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLinking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		    driver.get("https://www.w3schools.com/howto/howto_make_a_website.asp");
	
		
	}

}
