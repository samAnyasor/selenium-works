package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseUtil;

public class Find_A_Cause extends BaseUtil{
	
	private BaseUtil base;
	public Find_A_Cause(BaseUtil base) {
		this.base=base;
	}

	By Find_A_Cause = By.xpath("/html/body/div[1]/div[2]/header/div/div/div[2]/nav/div[2]/a/span");
	By searchBox = By.id("sagc-hero-search-input");
	By searchButton = By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div/div/div/div/form/button/span");
	
	
	public void Click_Find_A_Cause() {
		base.driver.findElement(By.cssSelector(".bg-primary")).click();
		base.driver.findElement(Find_A_Cause).click();
	}
	public void Input_Chars(String Chars) {
		base.driver.findElement(searchBox).sendKeys(Chars);
		base.driver.findElement(By.cssSelector("li.style_suggestion__-CRCo:nth-child(4) > button:nth-child(1)")).click();
//		List<WebElement> list = base.driver.findElements(By.className("style_suggestionBtn__47Wy4"));
//		for(WebElement webElement : list) {
//			list.get(2).click();
//		}
//		new WebDriverWait(base.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(searchBox));
//		Select select = new Select((WebElement) searchBox);
//		select.selectByIndex(2);
	
	}
	public void clickSearch() {
		base.driver.findElement(searchButton).click();
	}
	public void confirmCause() {
		WebElement causeExists = base.driver.findElement(By.cssSelector(".typography-2xl"));
		System.out.println("This is to confirm that " + causeExists.getText()+ ",exists!");
		
		
	}

}
