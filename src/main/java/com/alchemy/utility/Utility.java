package com.alchemy.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	
	public static Object fetchpropertValue(String key) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("./Config/config.properties");
		
		
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
		
//		String fetchElementLocator(String key) throws IOException
//		{
//			FileInputStream file = new FileInputStream("./Config/Elements.properties");
//			Properties property = new Properties();
//			property.load(file);
//			return property.get(key).toString();
//		}
//	}
	

	}
	}
