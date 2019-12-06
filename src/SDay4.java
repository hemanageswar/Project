import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SDay4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Code Depository\\Selenium Day 4\\driver\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		a.get("https://www.flipkart.com/");
		  Thread.sleep(5000);
	    WebElement v = a.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	    Thread.sleep(5000);
	    v.click();
	    WebElement d = a.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[6]"));
	    
	    Actions s = new Actions(a);
	    s.moveToElement(d).perform();
	    
	    Thread.sleep(2000);
	    WebElement e = a.findElement(By.xpath("//a[@title='Chairs']"));
	   Actions q = new Actions(a);	    
	   q.moveToElement(e).perform(); 
	   e.click();
	   Thread.sleep(2000);
	   WebElement b = a.findElement(By.xpath("(//a[@class='_2cLu-l'])[1]"));
	  b.click();
	  Thread.sleep(2000);
	  WebElement c =a.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
	  
	  c.click();
	}	
}

