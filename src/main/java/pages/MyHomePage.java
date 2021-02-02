package pages;

import wrapper.ProjectSpecificWrapper;

public class MyHomePage extends ProjectSpecificWrapper{
	
	public MyLeadsPage clickLeadsLink() {
		
		clickByLinkText("Leads");
		return new MyLeadsPage();
	}

}
