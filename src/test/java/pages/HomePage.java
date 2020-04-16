package pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	

	OrangeHRMHomePage homePage;
	
	@Step
	public void openApplication()
	{
		homePage.open();
	}
	
	@Step
	public void enterUsername()
	{
		homePage.enterUname();
	}
	
	@Step
	public void enterPassword()
	{
		homePage.enterPassword();
	}
	
	@Step
	public void clickOnLoginButton()
	{
		homePage.clickLogin();
		
	}
	
	

}
