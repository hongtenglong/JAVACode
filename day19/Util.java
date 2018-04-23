package day19;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {
	Properties pros = new Properties();
	InputStream is = Demo2.class.getClassLoader().getResourceAsStream("day19/fruit.properties");
	public String getProperty(String s) throws IOException {
		pros.load(is);
		return pros.getProperty(s);
	}
	
}
