package pages;

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

	public CRMHomePage clickCRMSFA(){
		clickByLink(prop.getProperty("CRMHomePage.CRM/SFA.Link"));
		return new CRMHomePage();
		
		
	}
	
	public LoginPage clickLogout() {
		clickByClassName(prop.getProperty("Home.Logout.Class"));
		return new LoginPage();
	}















}
