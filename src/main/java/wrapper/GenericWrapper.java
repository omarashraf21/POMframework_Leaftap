package wrapper;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods {
	
	public static ChromeDriver driver;

	public void invokeApp(String url) {

		//below we create Exception and handle it
		try {
					
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The chrome browser launched successfully");
		}catch(Exception e){
		System.err.println("The chrome browser not launched");
		}
		
		finally {
			takesnap();
		}
	}

	public void enterById(String idValue, String data) {
		driver.findElementById(idValue).sendKeys(data);

	}
	/*
	 * public void enterById(String idValue, int value) {
	 * driver.findElementById(idValue).sendKeys(value);
	 */
		
	public void enterByName(String nameValue, String data) {
		driver.findElementByName(nameValue).sendKeys(data);

	}

	public void enterByXpath(String xpathValue, String data) {
		driver.findElementByXPath(xpathValue).sendKeys(data);

	}
	
	public void enterByCssSelector(String CssValue, String data) {
		driver.findElementByCssSelector(CssValue).sendKeys(data);
	}

	public boolean verifyTitle(String title) {
		String title2 = driver.getTitle();
		if (title.equals(title2)) {
			System.out.println("title is matched");
		} else {
			System.out.println("title not matched");
		}
		return false;
	}

	public void verifyTextById(String id, String text) {
		String txt = driver.findElementById(id).getText();
		if (txt.equals(text)) {
			System.out.println("text is matched");
		} else {
			System.out.println("text is not matched");
		}

	}

	public void verifyTextByXpath(String xpath, String text) {
		String txt = driver.findElementByXPath(xpath).getText();
		if (txt.equals(text)) {
			System.out.println("text is matched");
		} else {
			System.out.println("text not matched");
		}

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		String txt = driver.findElementByXPath(xpath).getText();
		if (txt.contains(text)) {
			System.out.println("text is matched");
		} else {
			System.out.println("text not matched");
		}

	}

	public void verifyTextContainsById(String id, String text) {
		String txt = driver.findElementById(id).getText();
		if (txt.contains(text)) {
			System.out.println("text is matched");
		} else {
			System.out.println("text not matched");
		}

	}

	public void clickById(String id) {
		driver.findElementById(id).click();

	}

	public void clickByClassName(String classVal) {
		driver.findElementByClassName(classVal).click();

	}

	public void clickByName(String name) {
		driver.findElementByName(name).click();

	}

	public void clickByLinkText(String text) {
		driver.findElementByLinkText(text).click();

	}

	public void clickByXpath(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();

	}
	
	public void clickByCssSelector(String CssValue, String value) {
		driver.findElementByCssSelector(CssValue).click();
		
	}

	public String getTextById(String idVal) {
		String text = driver.findElementById(idVal).getText();
		return text;
	}

	public String getTextByXpath(String xpathVal) {
		String text = driver.findElementByXPath(xpathVal).getText();
		return text;
	}

	public void selectVisibileTextById(String id, String value) {
		WebElement ele = driver.findElementById(id);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);

	}
	public void selectByVisibleTextByName(String name, String value) {
		WebElement ele = driver.findElementByName(name);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
	}

	public void selectIndexById(String id, int value) {
		WebElement ele = driver.findElementById(id);
		Select dd = new Select(ele);
		dd.selectByIndex(value);

	}
	
	public void selectIndexByName(String Name, int Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd = new Select(ele);
		dd.selectByIndex(Value);
	}
	
	public void selectByValueById(String id, String value) {
		WebElement ele = driver.findElementById(id);
		Select dd = new Select(ele);
		dd.selectByValue(value);
	}
	
	public void selectByValueByName(String name, String value) {
		WebElement ele = driver.findElementByName(name);
		Select dd = new Select(ele);
		dd.selectByValue(value);
	}

	public void switchToParentWindow() {
		Set<String> allwin = driver.getWindowHandles();
		for (String eachwin : allwin) {
			// System.out.println(eachwin);
			driver.switchTo().window(eachwin);
			break;
		}
	}

	public void switchToLastWindow() {
		Set<String> allwin = driver.getWindowHandles();
		for (String eachwin : allwin) {
			// System.out.println(eachwin);
			driver.switchTo().window(eachwin);
		}
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void takesnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File tar = new File("./snap/image.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void quitBrowser() {
		driver.quit();

	}
	public void closeBrowser() {
		driver.close();
	}

}
