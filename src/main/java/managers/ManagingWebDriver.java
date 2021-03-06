package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.Drivers;


public class ManagingWebDriver {

	private WebDriver driver;
	private static Drivers driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
 
	public ManagingWebDriver(){
	driverType = ManagingFileReading.getInstance().getConfigReader().getBrowser();
	}
 
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
 
 	private WebDriver createDriver() {
	 switch (driverType) {	    
	 case FIREFOX : driver = new FirefoxDriver();
	 	break;
	  case CHROME : 
	 	System.setProperty(CHROME_DRIVER_PROPERTY, System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
     	driver = new ChromeDriver();
	 	break;
	   case INTERNETEXPLORER : 
		System.setProperty(IE_DRIVER_PROPERTY, System.getProperty("user.dir")+"\\resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();		   	   
	 	break;
	    }
 
	    if(ManagingFileReading.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(ManagingFileReading.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
	 	return driver;
	 }	
 
		
	
	
	
	
}
