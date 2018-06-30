package action;

import pageObjects.SignInPage;
import pageObjects.WomenFeaturePage;

public class WomenFeatureAction {
		
	public static void Execute () throws Exception {
	SignInPage.Wait();
	WomenFeaturePage.pictureClick(WomenFeaturePage.btn_picture());
////	WomenFeaturePage.pictureClick(WomenFeaturePage.btn_picture());
//	WomenFeaturePage.SelectItem(WomenFeaturePage.slc_sortby(), 1);
	

}
}