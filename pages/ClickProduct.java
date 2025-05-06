package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClickProduct extends CountProducts {

    @Test
    public void clickTheProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String xpath = "//img[@alt='All Mobiles Body And Back Available In Excellent quality Infinix,oppo,samsung,tecno, Huawei']";
        
        try {
            WebElement firstProduct = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath(xpath))
            );
            firstProduct.click();
            
            @SuppressWarnings("deprecation")
			String productUrl = firstProduct.getAttribute("href");
            System.out.println("Clicking product with URL: " + productUrl);
            
        } catch (Exception e) {
            System.out.println("Error while clicking the product: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

