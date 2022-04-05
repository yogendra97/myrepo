package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata {
	
	public Object[][] Userdata() throws EncryptedDocumentException, IOException {
		FileInputStream File=new FileInputStream("C:\\Eclipse workspace\\PageObjModule\\Test Data\\Multipleuserdata.xlsx");
		Sheet Sheet = WorkbookFactory.create(File).getSheet("Sheet1");
		
		Object [][] data=new Object[Sheet.getLastRowNum()][Sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<Sheet.getLastRowNum();i++) {
			for(int j=0;j<Sheet.getRow(0).getLastCellNum();j++) {
				data[i][j]=Sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		
		return data;
		
	}

}
