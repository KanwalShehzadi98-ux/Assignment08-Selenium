package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Shipping extends BaseTest {

	@Test()
	public void verifyShipping() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	    
	    try {
	        WebElement percentageDiv = wait.until(ExpectedConditions.presenceOfElementLocated(
	            By.xpath("//div[normalize-space()='100%']")
	        ));
	        
	        Assert.assertEquals(percentageDiv.getText().trim(), "100%", 
	            "Shipping progress did not reach 100% completion");
	        
	    } catch (Exception e) {
	        Assert.fail("Shipping verification failed: " + e.getMessage(), e);
	    }
	}
    
}