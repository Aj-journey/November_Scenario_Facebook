package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropDownhandle;
import UtilityLayer.WebelementUtils;

public class RegistrationPage extends BaseClass{

	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement sname;
	
	
	@FindBy(id="day")
	WebElement date;
	
	
	@FindBy(id="month")
	WebElement month;
	
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBys(@FindBy(xpath="//span[@class='_5k_2 _5dba']"))
	List<WebElement> genderList;
	
	
	@FindBy(name="reg_email__")
	WebElement email;
	
	
	@FindBy(name="reg_passwd__")
	WebElement newPassw;
	
	
	@FindBy(name="websubmit")
	WebElement signUp;
	
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registrationFunctionality(String Fname,String Lname)
	{
		WebelementUtils.sendkeys(fname, Fname);
		WebelementUtils.sendkeys(sname, Lname);
	}
	
	public void dobFunctionality(String Date,String Month,String Year)
	{
		DropDownhandle.handleDropDown(date, Date);
		DropDownhandle.handleDropDown(month, Month);
		DropDownhandle.handleDropDown(year, Year);
	}
	
	public void genderFunctioanlity(String Gender)
	{
		WebelementUtils.radioHandle(genderList, Gender);
	}
	
	public void emailAndPassFunctioanlity(String Email,String Passw)
	{
		WebelementUtils.sendkeys(email, Email);
		WebelementUtils.sendkeys(newPassw, Passw);
	}
	
	public void signUpFunctioanlity()
	{
		WebelementUtils.click(signUp);
	}
}
