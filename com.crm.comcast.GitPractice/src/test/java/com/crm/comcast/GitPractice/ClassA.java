package com.crm.comcast.GitPractice;

import org.testng.annotations.Test;

public class ClassA 
{
	@Test
	public void demoTest()
	{
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
		System.out.println("First Push");
	}
}
