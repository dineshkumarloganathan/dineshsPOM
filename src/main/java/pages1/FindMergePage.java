package pages1;

import utils.Reporter;
import wrappers1.OpentapsWrappers;



public class FindMergePage extends OpentapsWrappers{

	public FindMergePage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Leads | opentaps CRM", "FAIL");
	}	

	public FindMergePage clickPhone() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.Phone.xpath"));
		Thread.sleep(5000);
		return this;
	}

	public FindMergePage clickPhoneNumber() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.PhoneNumber.xpath"));
		Thread.sleep(5000);
		return this;
	}

	public FindMergePage clickFindLead() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.FindLeads.xpath"));
		Thread.sleep(5000);
		return this;
	}

	
	public ViewLeadPage clickDisplayedLeadId() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.fNameandLname.xpath"));
		Thread.sleep(5000);
		return new ViewLeadPage();
	}
	
	public FindMergePage verifyText() throws InterruptedException
	{
		verifyText(prop.getProperty("FindLead.verifytext.xpath"));
		Thread.sleep(5000);
		return this;
	}
}
