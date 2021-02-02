package wrapper;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificWrapper extends GenericWrapper{
	
	public String excelfile;

	//@Parameters({"url"})
	@BeforeMethod
	public void login() {
		invokeApp("http://leaftaps.com/opentaps");

	}

	@AfterMethod
	public void closeBrowser() {
		quitBrowser();
	}

	@DataProvider
	public String[][] getData() throws IOException {		
		ReadExcel rl = new ReadExcel();
		return rl.readExcel(excelfile);		
	}

}
