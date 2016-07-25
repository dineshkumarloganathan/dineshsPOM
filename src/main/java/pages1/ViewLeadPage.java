package pages1;

import utils.Reporter;
import wrappers1.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	



	public EditLeadPage ClickEdit() {
		clickByLink(prop.getProperty("CreateLead.click.name"));
		return new EditLeadPage();
	}
	












}
