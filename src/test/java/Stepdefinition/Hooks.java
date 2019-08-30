package Stepdefinition;

import cucumber.Context;
import pageObjects.CheckoutPage;
import pageObjects.LoginPage;
import pageObjects.OrderHistoryPage;
import pageObjects.PaymentPage;
import pageObjects.ProductSelectionPage;
import pageObjects.UserInformationPage;

public class Hooks {
	Context testContext;
	CheckoutPage checkoutpage;
	LoginPage loginpage;
	OrderHistoryPage orderhistorypage;
	PaymentPage paymentpage;
	ProductSelectionPage productselectionpage;
	UserInformationPage userinformationpage;
	
	
	 
	public Hooks(Context context) {
		testContext = context;
		checkoutpage = testContext.getPageObjectManager().getCheckoutPage();
		loginpage = testContext.getPageObjectManager().getLoginPage();
		orderhistorypage = testContext.getPageObjectManager().getOrderHistoryPage();
		paymentpage = testContext.getPageObjectManager().getPaymentPage();
		productselectionpage = testContext.getPageObjectManager().getProductSelectionPage();
		userinformationpage = testContext.getPageObjectManager().getUserInformationPage();
	}	
}
