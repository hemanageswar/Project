import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S4 {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","C:\\Code Depository\\Selenium Day 4\\driver\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("https://www.shopclues.com/wholesale.html");
WebElement b=a.findElement(By.id("nav_45"));
Actions c = new Actions(a);
c.moveToElement(b).perform();
WebElement d= a.findElement(By.xpath("//a[text()='Weight Gainers']"));
Actions f = new Actions(a);
f.moveToElement(d).perform();
d.click();
WebElement h = a.findElement(By.xpath("(//span[contains(text(),'Medisys')])[1]"));
h.click();
WebElement j =a.findElement(By.xpath("//a[@class='cart_ic']"));
j.click();
WebElement k =a.findElement(By.xpath("(//span[text()='Rs 1309'])[4]"));
String p = k.getText();
System.out.println(p);
}
}
