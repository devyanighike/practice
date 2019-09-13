package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.Select;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Chrome driver/chromedriver.exe");
WebDriver dr= new ChromeDriver();
dr.get("https://www.facebook.com");
dr.manage().window().maximize();
dr.findElement(By.name("firstname")).sendKeys("Rads");
Actions act= new Actions(dr);
act.keyDown(Keys.SHIFT).build().perform(); 
JavascriptExecutor js= (JavascriptExecutor)dr;
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
dr.findElement(By.name("websubmit")).click();
//e1.sendKeys();
}

}
