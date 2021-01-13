package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.actitime.objesctrepository.EnetrTimeTrackPage;
import com.actitime.objesctrepository.LoginPage;

public class Baseclass {
public static WebDriver driver;
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

@BeforeClass
public void openBrowser() {
	Reporter.log("open browser",true);
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
}

@AfterClass
public void closeBrowser()
{
	Reporter.log("close browser",true);
	driver.close();
}

@BeforeMethod
public void logIn() throws IOException
{
	Reporter.log("log in", true);
	Filelib f=new Filelib();
	String un=f.getPropertyValue("username");
	String pw=f.getPropertyValue("password");
	driver.get(f.getPropertyValue("url"));
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pw);
	
}

@AfterMethod
public void logout()
{
	Reporter.log("log out",true);
	EnetrTimeTrackPage e= new EnetrTimeTrackPage(driver);
	e.setLogoutLink();
}
}

