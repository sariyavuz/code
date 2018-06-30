package action;

import pageObjects.CatalogPage;
import pageObjects.SignInPage;

public class CatalogAction {

	public static void Execute () throws Exception {
		SignInPage.Wait();
		CatalogPage.SelectItem(CatalogPage.slc_sortby(), 1);
		CatalogPage.choose_picture().click();

}}
