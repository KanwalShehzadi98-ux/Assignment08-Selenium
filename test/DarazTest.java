package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class DarazTest extends BaseTest{
	
	@Test
	public void navigateToDarazHomePage() {
		
		System.out.println("Successfully navigated to: " + driver.getTitle());
	}
	
}
