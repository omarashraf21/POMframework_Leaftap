package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateLeadPage extends ProjectSpecificWrapper{

	public CreateLeadPage enterComName(String CName) {
		enterById("createLeadForm_companyName", CName);
		return this;
	}

	public CreateLeadPage enterFName(String Fname) {
		enterById("createLeadForm_firstName", Fname);
		return this;
	}

	public CreateLeadPage  enterLName(String Lname) {
		enterById("createLeadForm_lastName", Lname);
		return this;

	}

	public ViewLeadPage clickCreateLeadBtn() {
		clickByXpath("//input[@value='Create Lead']");
		return new ViewLeadPage();
	}

	public CreateLeadPage chooseSource(String source) {
		selectVisibileTextById("createLeadForm_dataSourceId", source);
		return this;
	}
	
}
