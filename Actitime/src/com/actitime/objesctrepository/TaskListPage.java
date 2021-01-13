package com.actitime.objesctrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy (xpath=("//div[.='Add New']"))
private WebElement AddNewbtn;

@FindBy (xpath=("//div[.='+ New Customer']"))
private WebElement NewCustBtn;

@FindBy (xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement CustomerName;

@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement  CustomerDescription;

@FindBy (xpath="(//div[.='- Select Customer -'])[1]")
private WebElement  SelectCustomerDropDown;

@FindBy (xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
private WebElement OurCompanyOptopn;




@FindBy (xpath="//div[.='Create Customer']")
private WebElement CreateCustomerBtn;

@FindBy (xpath="//div[@class='titleEditButtonContainer']/div[@class='title'")
private WebElement ActualCustomerCreated;


public TaskListPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}


public WebElement getAddNewbtn() {
	return AddNewbtn;
}


public WebElement getNewCustBtn() {
	return NewCustBtn;
}


public WebElement getCustomerName() {
	return CustomerName;
}


public WebElement getCustomerDescription() {
	return CustomerDescription;
}


public WebElement getSelectCustomerDropDown() {
	return SelectCustomerDropDown;
}


public WebElement getOurCompanyOptopn() {
	return OurCompanyOptopn;
}


public WebElement getCreateCustomerBtn() {
	return CreateCustomerBtn;
}
public WebElement getActualCustomerCreated() {
	return ActualCustomerCreated;
}
}
