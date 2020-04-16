package pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {

	OrangeHRMDashboard dashboard;
	
	@Step
	public void verifyAdmin()
	{
		dashboard.loginVerified();
	}
	
}
