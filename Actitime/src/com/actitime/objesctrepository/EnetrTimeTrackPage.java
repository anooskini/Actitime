package com.actitime.objesctrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnetrTimeTrackPage {
	
@FindBy(id="container_tasks")
private WebElement Taskbar;

@FindBy(id="logoutLink")
private WebElement Logoutbtn;


public EnetrTimeTrackPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



public void setLogoutLink()
{
	Logoutbtn.click();
}
public WebElement getTasktab()
{
	return Taskbar;
}


}
 