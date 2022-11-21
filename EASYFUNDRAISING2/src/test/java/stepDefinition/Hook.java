package stepDefinition;


import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import library.Browsers;
import utility.BaseUtil;

public class Hook extends BaseUtil{
	
	
	Browsers browser;
	private BaseUtil base;
	public Hook(BaseUtil base) {
		this.base=base;
	}
	
	
	
	@Before
	public void setUp() {
		base.driver = browser.launchBrowser("Firefox");
		base.driver.manage().window().maximize();

	}
	@After
	public void tearDown() {
		base.driver.quit();
	}

}
