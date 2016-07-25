package pages1;

import utils.Reporter;
import wrappers1.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not Crm home Page", "FAIL");
	}	





	
	public CreateLeadPage clickcreateleadlink() {
	
		clickByClassName(prop.getProperty("CRMHome.click.link"));
		return new CreateLeadPage() ;
	}

	}











