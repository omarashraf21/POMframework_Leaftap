package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeadsPage extends ProjectSpecificWrapper {
	
	public CreateLeadPage clickCreateLeadLink() {
		clickByLinkText("Create Lead");
		return new CreateLeadPage();
	}
	

}
