package XPATHCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Installers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
     	driver.manage().window().maximize();
    	driver.findElement(By.className("_sv4")).click();
    	
    	//XPAth custom
//    	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("abcde");
//    	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
//    	driver.findElement(By.xpath("//*[@value='Log In']")).click();
    	
    	//CSS Custom
    	
//    	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abcde");
//    	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("abcde");
//    	driver.findElement(By.cssSelector("[value='Log In']")).click();
    	
    	driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abcde");
    	driver.findElement(By.cssSelector("input#pass")).sendKeys("abcde");
    	driver.findElement(By.cssSelector("[value='Log In']")).click();

	}

}
