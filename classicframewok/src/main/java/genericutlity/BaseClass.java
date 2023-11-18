package genericutlity;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public JavascriptUtility js;
	PropertyUtility ppt = new PropertyUtility();

@BeforeClass
public void launchingTheBrowser() throws IOException {
	if(ppt.reagingDataFromPropertyFile("browser").equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();	
	}else if(ppt.reagingDataFromPropertyFile("browser").equalsIgnoreCase("firefox"))
			{
		WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();	
	}else {
		WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();	

	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.get(ppt.readingPropertyFile("url");
}

	public void loadingObject() {

	}

	public void closingBrowser() {

	}
}
