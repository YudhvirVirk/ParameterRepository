package com.ud.testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class UdTest {

	@Parameters("browser")
	@Test
	public void test(String browser) {
		System.out.println("TEST"+browser);
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("AfterSuite");
	}
	
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("After Method");
	}
	
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("BeforeMethod");
	}
	
	
	@AfterTest
	public void aftertest(){
		System.out.println("After Test");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
	}
	
	
}
