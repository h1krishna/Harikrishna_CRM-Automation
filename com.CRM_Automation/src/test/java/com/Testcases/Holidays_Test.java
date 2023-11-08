package com.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Test_base;
import com.Page_objects.Holidays_Functionality;
import com.Page_objects.Login_Functionality;

public class Holidays_Test extends Test_base {
	Holidays_Functionality hf;
	Login_Functionality lf;
	public Holidays_Test() throws Throwable    {
		super();
		
	}
	@BeforeMethod
	public void setup() throws Throwable {
		Initialization();
		 lf=new Login_Functionality(driver);
		lf.Dologin();
		hf=new Holidays_Functionality(driver);
	}
	@Test
	public void validateaddnew() {
		hf.verifyHolidays();
	}
}
