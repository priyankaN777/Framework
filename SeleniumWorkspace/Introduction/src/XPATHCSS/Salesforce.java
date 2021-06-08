package XPATHCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//####XPath
		driver.get("https://salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("username")).sendKeys("this is my code");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		String s=driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(s);
		
		//CSS
//		driver.get("https://facebook.com");
//		driver.manage().window().maximize();
//		driver.findElement(By.className("_sv4")).click();
//		driver.findElement(By.cssSelector("#email")).sendKeys("tjiikmy");
//		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
//		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();

	}

}
