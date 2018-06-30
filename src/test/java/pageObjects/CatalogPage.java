package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CatalogPage extends BasePage{

	static WebElement element = null;
	
	public CatalogPage(WebDriver driver) {
		super(driver);
		
	}
	public static WebElement slc_sortby() {
		try {
			element = driver.findElement(By.id("selectProductSort"));
		
	}catch (Exception e) {
		e.getStackTrace();
	}
return element;
}
	public static WebElement choose_picture() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
		
	}catch (Exception e) {
		e.getStackTrace();
	}
return element;}
	public static void SelectItem(WebElement element,int index)	{
		Select slc = new Select(element);
		slc.selectByIndex(index);
}

public static void choose_picture(WebElement element) {
element.click();
}
}