package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_base {

	public static Properties props;
	public FileInputStream file;
	public static WebDriver driver;

	public Test_base() throws Throwable {
		props = new Properties();
		try {
			file = new FileInputStream("./src/main/java/com/configprop/configprop");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			props.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	public static void Initialization() {
		String browsername = props.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
		//	System.setProperty("webdriver.chrome.driver",
				//	"C:\\Users\\Admin\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64.zip\\msedgedriver.exe");
			driver=new EdgeDriver();
				
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(props.getProperty("url"));
		
	}

//		props = new Properties();
//
//		try {
//			file1 = new FileInputStream("./com.CRM_Automation/src/main/java/com/configprop/configprop");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			props.load(file1);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@SuppressWarnings("deprecation")
//	public static void Initialization() {
//
//		String browsername = props.getProperty("browser");
//
//		if (browsername.equalsIgnoreCase("chrome")) {
//
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\Admin\\Downloads\\chromedriver-win64.zip\\chromedriver-win64\\chromedriver-win64.exe");
//
//			driver = new ChromeDriver();
//
//		}
//
//		else if (browsername.equalsIgnoreCase("Edge")) {
//
//			System.setProperty("Webdriver.edge.driver",
//					"C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64.exe");
//
//			driver = new EdgeDriver();
//
//		}
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
//		driver.get(props.getProperty("url"));
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//
//	}

}
