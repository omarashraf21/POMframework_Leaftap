package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC001_LoginLogout extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
		
		excelfile = "TC001_Login";
		
	}
	
	@Test(dataProvider = "getData")
	public void loginLogout(String uName, String pwd) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickLogOut();
		
	}
	
}
