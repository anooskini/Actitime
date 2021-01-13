package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author user
 *
 */
public class Filelib {

/**
 * 
 * @param key
 * @return
 * @throws IOException
 */
public String getPropertyValue(String key) throws IOException {
FileInputStream fis=new FileInputStream("./data/commondata.property");
Properties p=new Properties();
p.load(fis);
String value=p.getProperty(key);
return value;
}
/**
 * 
 * @param sheet
 * @param row
 * @param cell
 * @return
 * @throws IOException
 */

public String getExcelValue(String sheetname,int row,int cell) throws IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String value=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
}
/**
 * 
 * @param status
 * @param sheet
 * @param row
 * @param cell
 * @throws IOException
 */
public void setExcelValue(String status,String sheetname,int row,int cell) throws IOException
{
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(status);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
}
}
