package pages1;

import utils.Reporter;
import wrappers1.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{

	public EditLeadPage() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not Edit Lead Page", "FAIL");
	}	
	

	public EditLeadPage ClickNewDatasourceDropdown(String data) {
		enterById(prop.getProperty("EditLead.dropdown1.selectvisibletextid"), data);
		return this;
	}

	public EditLeadPage clickAddbutton1() {
		clickByLink(prop.getProperty("EditLead.add1.Xpath"));
		return this;
	}

	public EditLeadPage NewMarketingCampaignDropDown(String data) {
		enterById(prop.getProperty("EditLead.dropdown1.selectvisibletextid"), data);
		return this;
	}
	
	public EditLeadPage clickAddbutton2() {
		clickByLink(prop.getProperty("EditLead.add2.Xpath"));
		return this;
	}

	
	public ViewLeadPage Clickupdatebutton() {
		clickByXpath(prop.getProperty("EditLead.update.Xpath"));
		return new ViewLeadPage();
	}

	public EditLeadPage Verifytext1(String data) {
		enterById(prop.getProperty("EditLead.dropdowntext1.verifytext"), data);
		return this;
	}
	
	public EditLeadPage Verifytext2(String data) {
		enterById(prop.getProperty("EditLead.dropdowntext2.verifytext"), data);
		return this;
	}
	
}


