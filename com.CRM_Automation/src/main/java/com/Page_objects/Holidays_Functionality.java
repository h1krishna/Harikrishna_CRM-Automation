package com.Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Test_base;
import com.Utils.Utils;
import com.Utils.Utils1;

public class Holidays_Functionality extends Test_base {
	public Holidays_Functionality() throws Throwable{
		super();
		
	}
	
	@FindBy(xpath="//i[@class='fa fa-database']")
	WebElement hover;

	@FindBy(xpath="//a[text()='Holidays']")
	WebElement holidays;
	@FindBy(xpath = "//i[@class='fa fa-plus'][2]")
	WebElement addnew;
	@FindBy(xpath="//input[@name='HolidayDate']")
	WebElement holidaydate;
	@FindBy(id="HolidayName")
	WebElement holidayname;
	@FindBy(id="HolidayDesc")
	WebElement holidaydesc;
	@FindBy(xpath = "//button[text()=' Save']")
	WebElement savebutton;
	
	public Holidays_Functionality(WebDriver driver) throws Throwable{
		PageFactory.initElements( driver,this);
	}
	public void verifyHolidays() {
		
		Utils1.actionMethods(hover);
		holidays.click();
		addnew.click();
		holidaydate.sendKeys(props.getProperty("date"));
		holidayname.sendKeys(props.getProperty("name"));
		holidaydesc.sendKeys(props.getProperty("description"));
		savebutton.click();
	}
}
