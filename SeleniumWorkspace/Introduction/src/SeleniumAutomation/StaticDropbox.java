package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Installers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s= new Select(we);
		//s.selectByValue("USD");
		//s.selectByIndex(2);
		s.selectByVisibleText("AED");

	}

}
