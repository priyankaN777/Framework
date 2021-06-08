import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gicko.driver", "D:\\Installers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		//String title=driver.getTitle();
		//System.out.println(title);


	}

}
