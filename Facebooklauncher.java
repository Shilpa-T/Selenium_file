import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklauncher {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shilpindu@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("shil1234");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}