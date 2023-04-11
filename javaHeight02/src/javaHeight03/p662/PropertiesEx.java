package javaHeight03.p662;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		Properties properties=new Properties();
		
		properties.load(PropertiesEx.class.getResourceAsStream("database.proeprties"));
		//글자 깨질 수도 있으니까 미리 예외처리 준비해야함
		
		System.out.println(properties.getProperty("driver"));
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("admin"));
	}

}
