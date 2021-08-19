package trello.common;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
	public static String getProperty(String key) throws IOException
	{
		FileReader file = new FileReader("src/test/java/trello/resource/trello.properties");
		Properties prop = new Properties();
		prop.load(file);
		String value = prop.getProperty(key);
		return value;
	}

}
