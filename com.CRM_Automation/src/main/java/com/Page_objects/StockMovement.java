package com.Page_objects;

import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Test_base;

public class StockMovement extends Test_base{
	public StockMovement() throws Throwable {
		super();
	}
	@FindBy(xpath="//input[contains(@class,'form-control-sm')]")
	WebElement search;
	@FindBy(xpath="//table[@id='mydatatable']/tbody/tr/td[9]")
	List<WebElement> table;
	public StockMovement(WebDriver driver)throws Throwable
	{
		PageFactory.initElements(driver,this);
	}
	public void verifyWHtoSR()
	{
		search.sendKeys(props.getProperty("Note"));
		for(WebElement row:table)
		{
			String note=row.getText();
			if(note.equals(props.getProperty("Note")))
			{
				Assert.assertEquals(note,props.getProperty("Note"));
				break;
			}
		}
	}
	public void verifySRtoWH()
	{
		search.sendKeys(props.getProperty("Notes"));
		for(WebElement row:table)
		{
			String notes=row.getText();
			if(notes.equals(props.getProperty("Notes")))
			{
				Assert.assertEquals(notes,props.getProperty("Notes"));
				break;
			}
		}
	}
	}


