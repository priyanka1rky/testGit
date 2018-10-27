package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyhelper {
	public String getvalue(String key) throws IOException
	{
		FileInputStream f1=new FileInputStream ("C:\\Users\\ravie\\workspace\\P1\\src\\main\\java\\genericLib\\config.properties");
		Properties p1=new Properties();
		p1.load(f1);
		return(p1.getProperty(key));
	}

}
