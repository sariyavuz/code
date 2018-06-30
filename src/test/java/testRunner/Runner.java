package testRunner;

import action.CatalogAction;
import action.SalesAction;
import action.SignInAction;
import action.WomenFeatureAction;

public class Runner {

	public static void main(String[] args) throws Exception {
		SignInAction.Execute();
		WomenFeatureAction.Execute();
		CatalogAction.Execute();
		SalesAction.Execute();
	}

}
 