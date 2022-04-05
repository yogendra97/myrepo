package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public String Username() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Eclipse workspace\\PageObjModule\\Test Data\\Parameterization.xlsx");
		String Username = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		return Username;
	}
	
	public String password() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Eclipse workspace\\PageObjModule\\Test Data\\Parameterization.xlsx");
		String Password = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		return Password;
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Parameterization par=new Parameterization();
		System.out.println(par.Username());
		System.out.println(par.password());
	}
}
