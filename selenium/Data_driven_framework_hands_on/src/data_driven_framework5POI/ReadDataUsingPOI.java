package data_driven_framework5POI;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataUsingPOI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(
				"/home/arunachalam/eclipse-workspace/learn_automation_online/selenium/Data_driven_framework_hands_on/TestDatausingPOI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		List<String>username=new ArrayList<String>();
		List<String>password=new ArrayList<String>();
		// iterator for row
		Iterator<Row> row = sheet.iterator();

		while (row.hasNext()) {
			Row currentRow = row.next();

			Iterator<Cell> cell = currentRow.iterator();
				int i=2;
				
				while(cell.hasNext())
				{
				if(i%2==0)
				{
					username.add(cell.next().toString());
				}
				else
				{
					
					password.add(cell.next().toString());
				}
				i++;
				}
				
		}
		
		System.out.println("username is "+username);
		System.out.println("password is "+password);
	}
}
