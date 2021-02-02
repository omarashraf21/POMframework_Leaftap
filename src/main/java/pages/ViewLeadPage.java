package pages;

import wrapper.ProjectSpecificWrapper;

public class ViewLeadPage extends ProjectSpecificWrapper {
	
	public ViewLeadPage verifyFirstName(String firstname) {
		verifyTextByXpath("//span[@id='viewLead_firstName_sp']", firstname);
		return this;
	}

}
