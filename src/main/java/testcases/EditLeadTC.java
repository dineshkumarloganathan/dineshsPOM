package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages1.LoginPage;
import wrappers1.OpentapsWrappers;

public class EditLeadTC extends OpentapsWrappers{

	
	
		@Test(dataProvider="fetchData")
		
		public void EditLeadPage(String FirstName) {

			
		}
		
		@BeforeClass
		public void beforeClass() {
			dataSheetName="TC001";
			browserName="chrome";
			testCaseName="Login to OpenTaps";
			testDescription="edit lead";
		}

		
		
		
}
