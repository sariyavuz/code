package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesPage extends BasePage {

	static WebElement element = null;
	
	public SalesPage(WebDriver driver) {
		super(driver);
		
	}
	public static WebElement slc_quant() {
		try {
			element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/a[2]/span"));
		
	}catch (Exception e) {
		e.getStackTrace();
	}
return element;
}
	public static WebElement slc_size() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		
	}catch (Exception e) {
		e.getStackTrace();
	}
return element;}
	
	public static WebElement btn_addtocart() {
		try {
			element = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		
	}catch (Exception e) {
		e.getStackTrace();
	}
return element;}
	
	
	
	public static void SelectItem(WebElement element,int index)	{
		Select slc = new Select(element);
		slc.selectByIndex(index);
}

public static void btn_addtocart(WebElement element) {
element.click();
}
}

