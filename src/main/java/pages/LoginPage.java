package pages;

import wrapper.ProjectSpecificWrapper;


//1. every page is a Java class
//2. inherit with common superclass
public class LoginPage extends ProjectSpecificWrapper {
	
	//3. Every action is a Java methods
	public LoginPage enterUserName(String uName) {
		
		enterById("username", uName);
		//4. add return type/where it land
		return this;
				
	}	
	public LoginPage enterPassword(String pwd) {
		enterById("password", pwd);
		return this;
	}	
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage();
	}

}
