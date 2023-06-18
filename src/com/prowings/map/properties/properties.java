package com.prowings.map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop=new Properties();
		
		prop.setProperty("dbUsername", "abc");
		prop.setProperty("dbPwd", "abc123");
		prop.setProperty("dburl", "zzzzzzzzzz");
		
//		System.out.println(prop);
		
//		System.out.println(prop.getProperty("dbPwd"));
		
		Properties myProp=new Properties();
		
		myProp.load(new FileInputStream("F:\\java programs\\Collection\\src\\com\\prowings\\map\\properties"));
		
		System.out.println(myProp.get("dbUsername"));
		System.out.println(myProp.get("dbPwd"));
//		System.out.println(myProp.get("dbid"));
//		System.out.println(myProp);
		
		
		
		
		
		
		
		
	}
	
	
	
}
