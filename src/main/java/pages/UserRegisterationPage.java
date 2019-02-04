package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName")
	WebElement FirstnametextBox;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName")
	WebElement LastNametextbox;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Email")
	WebElement Emailtxtbox;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName")
	WebElement UserNametxtbox;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Password")
	WebElement Passwordtxtbox;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ConfirmPassword")
	WebElement ConfirmPasswordtxtbox;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm___CustomNav0_StepNextButton")
	WebElement ClickRegisterButton;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CompleteStepContainer_lblCompleteStep")
	public WebElement sucessmsg;
	
	public void UserInfoRegisteration(String FirstName, String LastName, String Email, String UserName, String Password)
	{
		FirstnametextBox.clear();
		//FirstnametextBox.sendKeys(FirstName);
		setText(FirstnametextBox, FirstName);
		
		LastNametextbox.clear();
		//LastNametextbox.sendKeys(LastName);
		setText(LastNametextbox, LastName);
		
		Emailtxtbox.clear();
		//Emailtxtbox.sendKeys(Email);
		setText(Emailtxtbox, Email);
		
		UserNametxtbox.clear();
		//UserNametxtbox.sendKeys(UserName);
		setText(UserNametxtbox, UserName);
		
		Passwordtxtbox.clear();
		//Passwordtxtbox.sendKeys(Password);
		setText(Passwordtxtbox, Password);
		
		ConfirmPasswordtxtbox.clear();
		//ConfirmPasswordtxtbox.sendKeys(Password);
		setText(ConfirmPasswordtxtbox, Password);
		
		clickButton(ClickRegisterButton); 
	}
	
	
	
	
	

}
