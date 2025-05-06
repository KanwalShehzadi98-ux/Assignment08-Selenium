package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class SearchResultsPage extends BaseTest{

	@Test
	public void searchElectronics() {
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("phones");
		driver.findElement(By.xpath("//a[text()='SEARCH']")).click();
		
		driver.findElement(By.xpath("//div//a[1]//label[1]//span[1]//input[1]")).click();
		
	}
}
