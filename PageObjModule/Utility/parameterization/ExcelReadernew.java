package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadernew {

	public Object[][] Userdata(String Excelpath,String Sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream File=new FileInputStream(Excelpath);
		Sheet Sheet = WorkbookFactory.create(File).getSheet(Sheetname);
		
		Object[][] Userdata=new Object[Sheet.getLastRowNum()][Sheet.getRow(0).getLastCellNum()];
	
		for(int i=0;i<Sheet.getLastRowNum();i++) {
			for(int j=0;j<Sheet.getRow(0).getLastCellNum();j++) {
				Userdata[i][j]=Sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return Userdata;
	}
}
