package genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile implements Autoconstant {
public String getproperty(String key) throws FileNotFoundException, IOException {
	Properties p=new Properties();
	p.load(new FileInputStream(propertyfilepath));
	return p.getProperty(key);
	
}
}
