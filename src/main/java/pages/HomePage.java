package pages;

import wrapper.ProjectSpecificWrapper;

public class HomePage extends ProjectSpecificWrapper {
	
	public MyHomePage clickCRMSFA() {
		clickByLinkText("CRM/SFA");
		return new MyHomePage();
	}
	
	public LoginPage clickLogOut() {
		clickByClassName("decorativeSubmit");
		return new LoginPage();
	}

}
