package test1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
public class xpath_concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/Chrome driver/chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.navigate().to("https://www.gmail.com");
dr.manage().window().maximize();
WebElement st= dr.findElement(By.xpath("//input[@id='identifierId']"));
 st.sendKeys("devyani.radhika@gmail.com");
// st1.click();



	}

}
