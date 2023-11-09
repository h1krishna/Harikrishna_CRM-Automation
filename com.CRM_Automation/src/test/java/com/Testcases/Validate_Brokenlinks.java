package com.Testcases;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Validate_Brokenlinks {

	public static void main(String[] args) throws Throwable    {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of links are"+links.size());
		for(WebElement e:links) {
			String url = e.getAttribute("href");
			URL link=new URL(url);
		//	HttpsURLConnection httpconn = (HttpsURLConnection) link.openConnection();
			HttpsURLConnection httpconn=(HttpsURLConnection)link.openConnection();
			httpconn.connect();
			int responcecode = httpconn.getResponseCode();
			if(responcecode>=400) {
				System.out.println(url+"====>is a broken link");
			}
			else {
				System.out.println(url+"====>is a valid link");
			}
		}
		
	}
	}
		
		
		
		
//		
//		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice");
//		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
//		// String url =
//		// footerDriver.findElement(By.xpath("//a[contains(text(),'SoapUI')]")).getAttribute("href");
//		List<WebElement> links = footerDriver.findElements(By.cssSelector("li[class='gf-li'] a"));
//		SoftAssert a = new SoftAssert();
//		for (WebElement link : links) {
//
//			String url = link.getAttribute("href");
//			HttpsURLConnection conn = (HttpsURLConnection) new URL(url).openConnection();
//			conn.setRequestMethod("HEAD");
//			conn.connect();
//			int resposnceCode = conn.getResponseCode();
//			String urlName = link.getText();
//			System.out.println(resposnceCode);
//			a.assertTrue(resposnceCode < 400, "The link with " + urlName + "is broken with code" + resposnceCode);
//		}
//		a.assertAll();
//	}


	//}


