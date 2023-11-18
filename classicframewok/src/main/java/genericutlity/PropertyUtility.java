package genericutlity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility implements IAutoconstants {
public String reagingDataFromPropertyFile(String key) throws IOException {
	FileInputStream fis=new FileInputStream(PROPERTY_FILE_PATH);
	Properties ppt=new Properties();
	ppt.load(fis);
	return ppt.getProperty(key);
	}
}
