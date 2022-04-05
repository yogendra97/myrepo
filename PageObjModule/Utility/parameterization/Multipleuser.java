package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multipleuser {
	
	public Object[][] getuserdata(String ExcelFilePath,String SheetName) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream(ExcelFilePath);
		Sheet Sheet = WorkbookFactory.create(file).getSheet(SheetName);
		
		Object[][] data=new Object[Sheet.getLastRowNum()][Sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<Sheet.getLastRowNum();i++) {
			for(int j=0;j<Sheet.getRow(0).getLastCellNum();j++) {
				
				data[i][j]=Sheet.getRow(i+1).getCell(j).getStringCellValue();
				
				
				
			}
				
		}
		return data;
			
	}

}
