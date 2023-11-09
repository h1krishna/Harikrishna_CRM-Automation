package com.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Test_base;
import com.Page_objects.Location_pageobjects;
import com.Page_objects.Login_Functionality;
import com.Page_objects.MoveStack_Pageobjects;

public class Location_Test extends Test_base {
	public Location_pageobjects lp;
	public Login_Functionality lf;

	public Location_Test() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws Throwable {
		Initialization();

		lf = new Login_Functionality(driver);

		lf.Dologin();

		lp = new Location_pageobjects(driver);
	}

	@Test
	public void validateLocation() throws Throwable {
		lp.verifyLocation();
	}
}
