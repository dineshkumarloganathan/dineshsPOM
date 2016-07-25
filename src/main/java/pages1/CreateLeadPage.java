package pages1;

import utils.Reporter;
import wrappers1.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	



	public CreateLeadPage enterCompanyName(String data) {
		enterById(prop.getProperty("CreateLead.CompanyName.id"), data);
		return this;
	}
	public CreateLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("CreateLead.FirstName.id"), data);
		return this;
	}
	public CreateLeadPage enterLastName(String data) {
		enterById(prop.getProperty("CreateLead.LastName.id"), data);
		return this;
	}
	public CreateLeadPage clickcreateLead() {
		clickByLink(prop.getProperty("CreateLead.click.name"));
		return this;
	}











}
