package pages1;

import utils.Reporter;
import wrappers1.OpentapsWrappers;

public class HomePage extends OpentapsWrappers{

	public HomePage() {
		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
			Reporter.reportStep("This is not Home Page", "FAIL");
	}	

	public HomePage verifyUserName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}

	
	
	public CRMHomePage clickcrmsfalink() {
	
		clickByClassName(prop.getProperty("Home.Click.link"));
		return new CRMHomePage() ;
	}
	
	
	public LoginPage clicklogout(){
		clickByClassName(prop.getProperty("Login.Logout.Class"));
		return new LoginPage() ;
	}

	}













