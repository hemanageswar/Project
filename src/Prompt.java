import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Code Depository\\Selenium Day 4\\driver\\chromedriver.exe");
	WebDriver n = new ChromeDriver();
	n.get("http://demo.automationtesting.in/Alerts.html");
	WebElement a = n.findElement(By.xpath("(//a[contains(text(),'Alert')])[4]"));
	a.click();
	Thread.sleep(2000);
	WebElement b = n.findElement(By.xpath("//button[@class='btn btn-info']"));
	Thread.sleep(2000);
	b.click();
	Alert e = n.switchTo().alert();
	e.sendKeys("hello");
    e.accept();
}
}
