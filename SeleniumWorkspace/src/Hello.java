import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	      
       driver.get("http://localhost:8081/");
	}

}
