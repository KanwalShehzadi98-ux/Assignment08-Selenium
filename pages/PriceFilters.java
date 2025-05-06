package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import base.BaseTest;

public class PriceFilters extends BaseTest {

    @Test
    public void applyFilters() {
        try {
            driver.get("https://www.daraz.pk/smartphones/");   
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            System.out.println("Current URL: " + driver.getCurrentUrl());
            WebElement priceFilterSection = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(text(),'Price') or contains(text(),'PRICE')]")));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", priceFilterSection);
            WebElement minInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Min' or contains(@id,'minPrice') or contains(@name,'minPrice')]")));
            WebElement maxInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Max' or contains(@id,'maxPrice') or contains(@name,'maxPrice')]")));
            minInput.clear();
            minInput.sendKeys("500");
            maxInput.clear();
            maxInput.sendKeys("5000");
            System.out.println("Min value: " + minInput.getAttribute("value"));
            System.out.println("Max value: " + maxInput.getAttribute("value"));
            WebElement filterButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(@class,'ant-btn')]")));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", filterButton);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//div[contains(@class,'loading')]")));       
        } catch (Exception e) {
            System.err.println("Test failed: " + e.getMessage());
            throw e;
        }
    }
}