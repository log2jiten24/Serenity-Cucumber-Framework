package pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {

	OrangeHRMDashboard dashboard;
	Newtourlogindashboard dashboardnewtour ;
	
	@Step
	public void verifyAdmin()
	{
		dashboard.loginVerified();
	}
	
	@Step
	public void selectflightround () throws Exception {
		
		dashboardnewtour.SelectFlightype();
	}
	
	@Step
	public void selectPassenger() throws Exception {
		
		dashboardnewtour.SelectPassengertype();
	}
	
	
	
	@Step
	public void clickcontinue() throws Exception {
		
		dashboardnewtour.ClickonContinue();
	}
	
	@Step
	public void signoff () throws Exception {
		
		dashboardnewtour.SignOff();
	}
}
