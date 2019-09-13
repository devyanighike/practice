package test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class practice2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Chrome driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com/?locale=in");
driver.manage().window().maximize();
//System.out.println(driver.getPageSource());
//driver.findElement(By.xpath("//input[@id='Login']]")).click();
//driver.findElement(By.id("forgot_password_link")).click();
//driver.findElement(By.id("forgot_password_link")).click();
driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
driver.findElement(By.cssSelector("#un")).sendKeys("abc");
driver.findElement(By.id("continue")).click();
System.out.println(driver.findElement(By.xpath("//div[@class='mb16 error']")).getText());
driver.navigate().back();
driver.navigate().back();
//driver.findElement(By.className("#a.secondary.button.fiftyfifty.mb16")).click();
driver.findElement(By.cssSelector("#signup_link")).click();

Thread.sleep(10000);
//driver.close();
	}

}
