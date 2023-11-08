package com.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Test_base;
import com.Page_objects.Login_Functionality;
import com.Page_objects.UserType_Pageobjects;

public class Usertypes_Test extends Test_base{
	Login_Functionality lf ;
	UserType_Pageobjects up;
	
	public Usertypes_Test() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws Throwable {
		Initialization();
		lf= new Login_Functionality(driver);
		lf.Dologin();
		  up=new  UserType_Pageobjects (driver);
		
	}
	@Test
	public void validateaddnewUsertype() throws Throwable  {
		
		up.verifyUsertypes();
	}
	
	@Test
	
	public void adduser() throws Throwable {
		
		
		up.adduser();
		
		
	}
	@Test
	public void edituser() throws Throwable {
		up.editusertypes();
	}

}
