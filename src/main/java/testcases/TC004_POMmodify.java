package testcases;

import org.testng.annotations.Test;

import pages1.LoginPage;
import wrappers1.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_POMmodify extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vErrorMess) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		//.clickLoginForFailure()
		.clickLogin()
		//.verifyErrorMessage(vErrorMess);
		.clickcrmsfalink();
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC002";
		browserName="chrome";
		testCaseName="Login to OpenTaps(Negative)";
		testDescription="Login(Failure) to Opentaps using POM framework";
	}

	
	
	
	
	
	
}
