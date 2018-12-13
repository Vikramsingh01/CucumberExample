package com.meganexus.methods;

import org.openqa.selenium.WebDriver;

import com.meganexus.utils.WebDriverManager;

public class JavascriptHandlingMethods implements BaseTest {
	protected WebDriver driver = WebDriverManager.getDriver(); // modified ..
	/**Method to handle alert
	 * @param decision : String : Accept or dismiss alert
	 */
	public void handleAlert(String decision)
	{
		if(decision.equals("accept"))
			driver.switchTo().alert().accept();
		else
			driver.switchTo().alert().dismiss();
	}
}
