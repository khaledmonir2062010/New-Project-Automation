package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegisterationPage;

public class UserRegistrationTest extends TestBase
{
	HomePage homeobject;
	UserRegisterationPage Registerobject;
	
	@Test
	public void useCanRegisterSuccessfully()
	{
		//This will going to Click on the Link of the register on the home page
		
		homeobject = new HomePage(driver);
		homeobject.openregisterationPage();
		
		//this will going to fill the data of the user
		Registerobject= new UserRegisterationPage(driver);
		Registerobject.UserInfoRegisteration("Khaled", "Monir", "k@test333.com", "khaledmn344", "12345678");
		Assert.assertTrue(Registerobject.sucessmsg.getText().contains("Your registration completed"));
		
	}
	
	
	
	

}
