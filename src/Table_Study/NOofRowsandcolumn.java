package Table_Study;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOofRowsandcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		List<WebElement> table = driver.findElements(By.id("product"));
		int totalNumOfRows = table.size();
		Iterator<WebElement> it = table.iterator();
		
		System.out.println("Total number of rows in table "+totalNumOfRows);
		while (it.hasNext()) {
			System.out.println(it.next().getText());

		}

		List<WebElement> column = driver.findElements(By.xpath("//table//tr//th"));
		for (int i = 0; i <= column.size() - 1; i++) {

			System.out.print(column.get(i).getText() + " ");

		}
		System.out.println();
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr//td"));
		for (int j = 1; j <= rows.size() - 1; j++) {

			System.out.print(rows.get(j).getText() + " ");
			System.out.println();
		}

	}

}
