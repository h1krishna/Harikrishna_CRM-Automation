package com.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base.Test_base;

public class Utils1 extends Test_base{

	public Utils1() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void actionMethods(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).click().perform();

}
}