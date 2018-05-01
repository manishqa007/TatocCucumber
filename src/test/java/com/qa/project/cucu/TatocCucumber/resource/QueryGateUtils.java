package com.qa.project.cucu.TatocCucumber.resource;

import com.qa.project.cucu.TatocCucumber.driver.DriverFactory;

public class QueryGateUtils extends DriverFactory{
	
	public static int id=0;
	public static String name="";
	public static String passkey="";
	public static String symbolPath = "//div[@id='symboldisplay']";
	public static String symbolText = getTextByXpath(symbolPath);
	public static String nameXpath = "//input[@name='name']";
	public static String passkeyXpath = "//input[@name='passkey']";
	public static String proceed = "//input[@value='Proceed']"; 
	public static String url="jdbc:mysql://10.0.1.86/tatoc";
	public static String userName="tatocuser";
	public static String password="tatoc01";
}
