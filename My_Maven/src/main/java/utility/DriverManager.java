package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
public WebDriver driver;

public void launchBrowser(String url) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashak\\git\\My-Training\\My_Maven\\src\\main\\resources\\chromedriver.exe");
	//driver=new ChromeDriver();
	ChromeOptions onarg=new ChromeOptions();
	onarg.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(onarg);
	driver.manage().window().maximize();

driver.get(url);
Thread.sleep(4000);

 
}
public void closeBrowser()
{
driver.close();
}

}


