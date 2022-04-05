package parameterization;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile_reader {
	
	Properties Pro;
	
	public Propertyfile_reader() {
		try {
			Pro=new Properties();
		FileInputStream File=new FileInputStream("C:\\Eclipse workspace\\PageObjModule\\src\\test\\resources\\Config.properties");
		Pro.load(File);
		
	}
		catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	
	public String Username() {
		String TempUSname=Pro.getProperty("Username");
		return TempUSname;
	}
	public String password() {
		String TempPWD=Pro.getProperty("Password");
		return TempPWD;
	}
	public String Chromepath() {
		
		String ChromePath=Pro.getProperty("Chromepath");
		return ChromePath;
	}
	public String URL() {
		String URL=Pro.getProperty("URL");
		return URL;
	}
	public String Firefoxpath() {
		String Firfoxpath=Pro.getProperty("Firefoxpath");
		return Firfoxpath;
	}
}

