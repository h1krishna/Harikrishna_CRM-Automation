package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Test_base;

import com.Page_objects.Login_Functionality;
import com.Page_objects.MoveStack_Pageobjects;
import com.Page_objects.StockMovement;

public class MovestackTest extends Test_base {
	Login_Functionality lf;
	MoveStack_Pageobjects mp;

	public MovestackTest() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws Throwable {

		Initialization();

		lf = new Login_Functionality(driver);

		lf.Dologin();

		mp = new MoveStack_Pageobjects(driver);

	}

	@Test
	public void movestockWtoS() {

		mp.movestocktfromWtoS();

	}

	@Test
	public void movestockStoW() {

		mp.movestocktfromStoW();

	}

}
