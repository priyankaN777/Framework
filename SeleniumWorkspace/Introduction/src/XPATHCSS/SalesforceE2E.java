package XPATHCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceE2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input#password")).sendKeys("ertt");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
