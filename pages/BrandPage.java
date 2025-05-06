package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class BrandPage extends BaseTest{

	@Test
	public void checkBrand() {
		
		driver.findElement(By.xpath("//div//a[1]//label[1]//span[1]//input[1]")).click();
	}
}
