package testcases;

import org.testng.annotations.Test;

import pages1.LoginPage;
import wrappers1.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC003_CreateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
		String companyname,String firstname,String lastname) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfalink()
		.clickcreateleadlink()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.clickcreateLead();
		//.clickLoginForFailure()
		//.verifyErrorMessage(vErrorMess);n
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Login to OpenTaps(Negative)";
		testDescription="Login(Failure) to Opentaps using POM";
	}

	
	
	
	
	
	
}
