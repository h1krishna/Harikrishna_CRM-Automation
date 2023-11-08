package com.Page_objects;


import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Test_base;
import com.Utils.Utils;
import com.Utils.Utils1;

public class UserType_Pageobjects extends Test_base {

	public UserType_Pageobjects() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//i[@class='fa fa-database']")
	WebElement hover;

	@FindBy(xpath = "//a[text()='User Types']")
	WebElement usertype;

	@FindBy(xpath = "(//a[@class='btn btn-add'])[2]")
	WebElement addnew;

	@FindBy(id = "TypeName")
	WebElement name;

	@FindBy(id = "TypeCode")
	WebElement code;

	@FindBy(xpath = "//button[@class='btn btn-success serchgaptop']")
	WebElement save;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;

	@FindBy(xpath = "(//button[@class='btn btn-add btn-sm'][3]")
	WebElement edit;

	// @FindBy(xpath = "//i[@class='fa fa-database']")
	// WebElement hover;

	// @FindBy(xpath = "//a[text()='User Types']")
	// WebElement usertypes;

	// @FindBy(xpath ="(//a[@class='btn btn-add'])[2]")
	// WebElement addnew;

//	@FindBy(xpath = "//input[@id='TypeName']")
//	WebElement typename;
//	
//	@FindBy(xpath = "//input[@id='TypeCode']")
//	WebElement typecode;
//	
//	@FindBy(xpath = "//button[@class='btn btn-success serchgaptop']")
//	WebElement savebutton;

	public UserType_Pageobjects(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, this);
	}

	public void verifyUsertypes() throws Throwable {

		Utils.actionMethods(hover);
		usertype.click();
		Thread.sleep(5);
		addnew.click();
		Thread.sleep(5);
		name.sendKeys(props.getProperty("typename"));
		code.sendKeys(props.getProperty("typecode"));
		save.click();
	}

	public void adduser() throws Throwable {
		// TODO Auto-generated method stub
		Utils.actionMethods(hover);
		usertype.click();
		Thread.sleep(2000);
		addnew.click();
		name.sendKeys(props.getProperty("typename"));
		code.sendKeys(props.getProperty("typecode"));
		Thread.sleep(2000);
		save.click();
		search.sendKeys(props.getProperty("search"));
		edit.sendKeys(props.getProperty("edit"));
		edit.sendKeys(props.getProperty("edit1"));
		save.click();
		// edit();
	}
public void editusertypes() throws Throwable {
		
		search.sendKeys(props.getProperty("typename1"));
		Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr"));
			int count = list.size();
			System.out.println("size: "+count);
			String xpath1="(//table/tbody/tr/td/a/button/i[@class='fa fa-pencil'])["+count+"]";
			driver.findElement(By.xpath(xpath1)).click();
			Thread.sleep(2000);
			name.clear();
			name.sendKeys(props.getProperty("typename1"));
			code.sendKeys(props.getProperty("typeCode1"));
			save.click();		
		
	}
}