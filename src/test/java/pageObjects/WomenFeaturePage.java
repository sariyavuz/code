package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WomenFeaturePage extends BasePage{
	
	static WebElement element = null;

	public WomenFeaturePage(WebDriver driver) {
		super(driver);
		
	
	
	
	}public static WebElement btn_picture() {
		try {
			element = driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a"));
		
	}catch (Exception e) {
		e.getStackTrace();
	
	}
		return element;}
//	}
//		public static WebElement slc_sortby() {
//		try {
//			element = driver.findElement(By.id("selectProductSort"));
//		
//	}catch (Exception e) {
//		e.getStackTrace();
//	}
//return element;
//}
//	public static WebElement btn_picture() {
//		try {
//			element = driver.findElement(By.id("selectProductSort"));
//		
//	}catch (Exception e) {
//		e.getStackTrace();
//	}
//return element;}
	
public static void SelectItem(WebElement element,int index)	{
			Select slc = new Select(element);
			slc.selectByIndex(index);
}

public static void pictureClick(WebElement element) {
	element.click();
}

}

