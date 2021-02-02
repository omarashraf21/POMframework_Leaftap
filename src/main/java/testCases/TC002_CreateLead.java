package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
		
		excelfile = "TC002_CreateLead";
		
	}
	
	@Test(dataProvider = "getData")
	public void loginLogout(String uName, String pwd, String CName, String Fname, String Lname, String firstname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterComName(CName)
		.enterFName(Fname)
		.enterLName(Lname)
		
		
		
		/*.clickMergeLeads()
		.clickIconNearFormLead()
		.enterLeadId(entLeadId)
		.clickFindLeadBtn()
		.clickFstResLead()
		.ClickIconNearToLead()
		.enterLeadId(entLeadId1)
		.clickFindLeadBtn()
		.clickFstResLead()
		.clickMerge()
		.clickFindLeads()
		.enterFormLeadId(enterFormLId)*/	
		
		.clickCreateLeadBtn()
		.verifyFirstName(firstname);
		
	}

}
