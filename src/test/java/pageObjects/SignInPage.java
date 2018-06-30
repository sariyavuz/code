package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Credentials;

public class SignInPage extends BasePage{

	public SignInPage(WebDriver driver) {
		super(driver);
		
	}

	static WebElement element = null;
	
	public static WebElement txt_email() {
		try {
			element = driver.findElement(By.id("email"));
		}catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement txt_password() {
		try {
			element = driver.findElement(By.id("passwd"));
		}catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement btn_login() {
		try {
			element = driver.findElement(By.id("SubmitLogin"));
		}catch (Exception e) {
			e.getStackTrace();
		}
		return element;
		
	}
		public static void startAPP() {
			
			String driverPath = Credentials.chromeDriverPath;
			String url = Credentials.url;
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get(url);
			
			
}
public static void Wait() {
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public static void signin() {
	driver.findElement(By.xpath("//a[@class='login']")).click();
}
}


