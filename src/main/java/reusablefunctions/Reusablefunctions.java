package reusablefunctions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import enums.Drivers;
//import enums.Environments;
import managers.PageObjectManager;
import pages.LoginPage;
import managers.ManagingWebDriver;

public class Reusablefunctions  {
	protected Properties properties;
	private final String propertyFilepath="configs//configurations.properties";
	ManagingWebDriver webDriverManager;
	LoginPage loginpage;
	PageObjectManager pageObjectManager;
	public WebDriver driver;
	
	
	
	public Reusablefunctions(){
		BufferedReader reader;
		try{
			reader=new BufferedReader(new FileReader(propertyFilepath));
			properties=new Properties();
		try {
			properties.load(reader);
			reader.close();
		}
				catch (IOException e){
				e.printStackTrace();
				
				}
		}
					catch (FileNotFoundException e) {
					e.printStackTrace();
					throw new RuntimeException("Configuration.properties not found at " + propertyFilepath);
				}
			}
		
		public long getImplicitlyWait() {		
			String implicitlyWait = properties.getProperty("implicitlyWait");
			if(implicitlyWait != null) 
				{
				try{
					return Long.parseLong(implicitlyWait);
				}catch(NumberFormatException e) {
					throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
				}
			}
			return 30;
				}
			
		public String getApplicationUrl() {
			String url = properties.getProperty("url");
			if(url != null) return url;
			else throw new RuntimeException("url not specified in the Configuration.properties file.");
		}
		public String getUserName(){
			String uname = properties.getProperty("uname");
			if(uname != null) return uname;
			else throw new RuntimeException("uname not specified in the Configuration.properties file.");
		}
		public String getpassword(){
			String pwd = properties.getProperty("pwd");
			if(pwd != null) return pwd;
			else throw new RuntimeException("pwd not specified in the Configuration.properties file.");
		}
		public String getRegisteredUserName(){
			String registeredUserName = properties.getProperty("registeredUserName");
			if(registeredUserName != null) return registeredUserName;
			else throw new RuntimeException("registeredUserName not specified in the Configuration.properties file.");
		}
		
		public Drivers getBrowser() {
			String browserName = properties.getProperty("browser");
			if(browserName == null || browserName.equals("chrome")) return Drivers.CHROME;
			else if(browserName.equalsIgnoreCase("firefox")) return Drivers.FIREFOX;
			else if(browserName.equals("iexplorer")) return Drivers.INTERNETEXPLORER;
			else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
		}		
	 
		public Boolean getBrowserWindowSize() {
			String windowSize = properties.getProperty("windowMaximize");
			if(windowSize != null) return Boolean.valueOf(windowSize);
			return true;
		}
		
		
}
