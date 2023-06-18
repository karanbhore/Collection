package com.prowings.map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) throws Exception {
		
		
		Properties p=new Properties();
		
		p.load(new FileInputStream("F:\\java programs\\Collection\\src\\com\\prowings\\map\\properties\\db.properties"));
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		System.out.println(p);
		p.setProperty("hi", "123");
		System.out.println(p);
		
		
	}
}
