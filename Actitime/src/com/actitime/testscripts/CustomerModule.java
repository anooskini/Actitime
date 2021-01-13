package com.actitime.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass;
import com.actitime.generics.Filelib;
import com.actitime.generics.WebDriverCommonLib;
import com.actitime.objesctrepository.EnetrTimeTrackPage;
import com.actitime.objesctrepository.TaskListPage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends Baseclass {
	@Test
public void testCreateCustomer() throws IOException, InterruptedException
{
		Filelib f= new Filelib();
		String CustomerName = f.getExcelValue("CreateCustomer", 1, 1);
		String CustomerDescription = f.getExcelValue("CreateCustomer", 1, 2);
		
		EnetrTimeTrackPage e= new EnetrTimeTrackPage(driver);
		e.getTasktab().click();;
		
		TaskListPage t= new TaskListPage(driver);
		t.getAddNewbtn().click();
		t.getNewCustBtn().click();
		t.getCustomerName().sendKeys(CustomerName);
		t.getCustomerDescription().sendKeys(CustomerDescription);
		t.getSelectCustomerDropDown().click();
		//t.getSelectCustomerDropDown().sendKeys("Our Company");
		t.getOurCompanyOptopn().click();
		t.getCreateCustomerBtn().click();
		
		
		
				
	}

}
