package TestActivities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity13_2a {
	
	//Write Data into Excel:
	
	  //Write Excel
    public void writeExcel(String filePath) throws IOException {
    	
    	//Creating workbook and sheet
    	XSSFWorkbook workbook = new XSSFWorkbook();
    	XSSFSheet sheet = workbook.createSheet("Sheet 1");
    	
    	//Preparing data
    	List<String[]> data = new ArrayList<String[]>();
    	String[] heading = {"ID", "First Name", "Last Name", "Email", "Ph.No."};
        String[] row1 = {"1", "Satvik", "Shah", "satshah@example.com", "4537829158"};
        String[] row2 = {"2", "Avinash", "Kati", "avinashK@example.com", "4892184058"};
        String[] row3 = {"3", "Lahri", "Rath", "lahri.rath@example.com", "4528727830"};
        
        data.add(heading);
        data.add(row1);
        data.add(row2);
        data.add(row3);
        
        for(String[] rowdata: data) {
        	int rownum = 0;
        	Row row = sheet.createRow(rownum++);
        	
        	int cellnum =0;
        	for(String celldata: rowdata) {
        		Cell cell = row.createCell(cellnum++);
        		cell.setCellValue(celldata);
        	}
        }
        FileOutputStream out = new FileOutputStream(new File(filePath));
        workbook.write(out);
        out.close();
        workbook.close();
        System.out.println("Write the data to Excel Successfully!!");
    	
    }

    //read data from Excel:
    public void readExcel(String filepath) throws IOException {
    	
    FileInputStream input = new FileInputStream(filepath);
    XSSFWorkbook workbook = new XSSFWorkbook(filepath);
    XSSFSheet sheet = workbook.getSheetAt(0);
    
    java.util.Iterator<Row> rowIterator = sheet.iterator();
    while(rowIterator.hasNext()) {
    	Row row=rowIterator.next();
    	
    	java.util.Iterator<Cell> cellIterator = row.cellIterator();
    	while(cellIterator.hasNext()) {
    		Cell cell = cellIterator.next();
    		switch(cell.getCellType()) {
    		case NUMERIC:
    			System.out.println(cell.getNumericCellValue() + " /t " );
    			break;
    			
    		case STRING:	
    			System.out.println(cell.getStringCellValue() + " /t ");
    			break;
    			
    		default:
    			System.out.println("Invalid format");
    			break;
    		}
    	}

    	input.close();
    	workbook.close();
    }
    
    }
    
	public static void main(String[] args) throws IOException {
		String filepath = "src/test/resources/sample.xlsx";
		Activity13_2a obj = new Activity13_2a();
		obj.writeExcel(filepath);
		obj.readExcel(filepath);
	}

}
