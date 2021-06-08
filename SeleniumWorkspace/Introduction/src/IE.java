import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\Installers\\IEDriver\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		String title=driver.getTitle();
		System.out.println(title);

	}

}
