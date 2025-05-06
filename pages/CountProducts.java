package pages;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class CountProducts extends BaseTest {
    
    public int getProductCount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        List<WebElement> products = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='_95X4G']")));
        return products.size();
    }
    
    @Test
    public void verifyProductsExistAfterFiltering() {
    	int productCount = getProductCount();
        System.out.println("Number of products found: " + productCount);
        Assert.assertTrue(productCount > 0, "Expected at least 1 product but found " + productCount);
    }
}