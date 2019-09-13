package test1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Chrome driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.santabanta.com");
driver.manage().window().maximize();
Actions action = new Actions(driver);
WebElement mouse= driver.findElement(By.className("arrow"));
action.moveToElement(mouse).build().perform();
	}
}
