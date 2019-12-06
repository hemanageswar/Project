import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Code Depository\\Selenium Day 4\\driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> b = a.findElements(By.tagName("tr"));
		int a2 = b.size()-2;
		for (int i = a2; i < b.size(); i++)
		{
	    WebElement a1 = b.get(i);
		String txt = a1.getText();	
		System.out.println(txt);
		}
		 
	}

}
