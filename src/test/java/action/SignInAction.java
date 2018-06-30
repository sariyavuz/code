package action;

import helper.Credentials;
import pageObjects.SignInPage;

public class SignInAction {
	
	public static void Execute() throws Exception{
		
		SignInPage.startAPP();
		SignInPage.Wait();
		SignInPage.signin();
		SignInPage.txt_email().sendKeys(Credentials.email);
		SignInPage.txt_password().sendKeys(Credentials.password);
		SignInPage.btn_login().click();
	}

}
