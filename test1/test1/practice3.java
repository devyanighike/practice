package test1;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class practice3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Chrome driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediffmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.cssSelector("input[id ='login1']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@name ='passwd']")).sendKeys("password");
		driver.findElement(By.cssSelector("body > div > div.lft_wrap > div.content-area > div.rhs-area.floatR > div.login-area-free.floatR > div > form > div > div:nth-child(6) > div:nth-child(1) > input[type=submit]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='login']/div/div[1]")).getText());
		Thread.sleep(10000);
		driver.close();

		
	}

}
