package cucumber;

import managers.PageObjectManager;
import managers.ManagingWebDriver;

public class Context {
	private ManagingWebDriver webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public Context(){
		webDriverManager = new ManagingWebDriver();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public ManagingWebDriver getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
 

}
