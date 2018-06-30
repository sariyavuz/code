package action;

import pageObjects.SalesPage;
import pageObjects.SignInPage;

public class SalesAction {
	
	public static void Execute () throws Exception {
		SignInPage.Wait();
		SalesPage.SelectItem(SalesPage.slc_quant(), 1);
		SalesPage.SelectItem(SalesPage.slc_size(), 1);
		SalesPage.btn_addtocart().click();

}}
