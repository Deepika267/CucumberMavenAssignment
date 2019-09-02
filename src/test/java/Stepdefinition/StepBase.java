package Stepdefinition;

import cucumber.Context;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.OrderHistoryPage;
import pages.PaymentPage;
import pages.ProductSelectionPage;
import pages.UserInformationPage;

public class StepBase {
	Context testContext;
	CheckoutPage checkoutpage;
	LoginPage loginpage;
	OrderHistoryPage orderhistorypage;
	PaymentPage paymentpage;
	ProductSelectionPage productselectionpage;
	UserInformationPage userinformationpage;
	
	
	 
	public StepBase(Context context) {
		testContext = context;
		checkoutpage = testContext.getPageObjectManager().getCheckoutPage();
		loginpage = testContext.getPageObjectManager().getLoginPage();
		orderhistorypage = testContext.getPageObjectManager().getOrderHistoryPage();
		paymentpage = testContext.getPageObjectManager().getPaymentPage();
		productselectionpage = testContext.getPageObjectManager().getProductSelectionPage();
		userinformationpage = testContext.getPageObjectManager().getUserInformationPage();
	}	
}
