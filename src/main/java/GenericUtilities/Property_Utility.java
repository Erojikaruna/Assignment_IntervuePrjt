package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Utility {
	
	public String FetchDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/LoginData.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
				
		
	}
}

