package pkg_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_10 
{
	public static void main(String[] args) 
	{
	System.setProperty("Webdriver.driver"," .\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement a =driver.findElement(By.id("email"));
	a.sendKeys("sheshyadavet2008@gmail.com");
	WebElement b =driver.findElement(By.id("pass"));
	b.sendKeys("yadav123");
	WebElement c =driver.findElement(By.id("u_0_2"));
	c.click();

}
}