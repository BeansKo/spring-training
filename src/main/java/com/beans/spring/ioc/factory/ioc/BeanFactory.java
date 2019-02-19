package com.beans.spring.ioc.factory.ioc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 模拟简单的IOC
 * @author Frank
 *
 */
public class BeanFactory {
	private static Properties props = new Properties();
	static {
		InputStream inStream  = BeanFactory.class.getResourceAsStream("/beans.properties");
		try {
			props.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object getBean(String name){
		String className = props.getProperty(name);
		try {
			return Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
