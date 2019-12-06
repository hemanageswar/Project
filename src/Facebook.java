import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static WebDriver b;

	private void launch() {
		b = new ChromeDriver();
		b.get("https://www.facebook.com/");
	}
	private void user(String user) {
	WebElement c = b.findElement(By.id("email"));
	c.sendKeys(user);
}
	
private void pass(String pass) {
	WebElement d = b.findElement(By.id("pass"));
    d.sendKeys(pass);	
}	
	
private void login() {
	WebElement e = b.findElement(By.id("loginbutton"));
    e.click();

}
	public static void main(String[] args)  {
		Facebook x = new Facebook();
		System.setProperty("webdriver.chrome.driver", "C:\\Code Depository\\Selenium Day 4\\driver\\chromedriver.exe");
		 x.launch();
		 x.user("9487785776");
		 x.pass("jsdhfj");
		 x.login();
		 b.close();
		 x.launch();
		 x.user("9487785776");
		 x.pass("*********");
		 x.login();
		 b.close();
		 x.launch();
		 x.user("kondfknsdf");
		 x.pass("********");
		 x.login();
		 b.close();
		 x.launch();
		 x.user("jskfvnvjn");
		 x.pass("jsdhfj");
		 x.login();
		 b.close();
			}
	}
