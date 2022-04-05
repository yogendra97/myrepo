package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fbparameterization {
	
	public String Username() throws EncryptedDocumentException, IOException {
		FileInputStream File =new FileInputStream("C:\\Eclipse workspace\\PageObjModule\\Test Data\\Multipleuserdata.xlsx");
		String Username = WorkbookFactory.create(File).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		return Username;
		
	}
	
	public String Password() throws EncryptedDocumentException, IOException {
		FileInputStream File=new FileInputStream("C:\\Eclipse workspace\\PageObjModule\\Test Data\\Multipleuserdata.xlsx");
		String Password = WorkbookFactory.create(File).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		return Password;
	}

}
