import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class click
{
public static void main(String[] args) throws Exception
{
	
//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_91\\chromedriver.exe");

WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://ahmadteausa.com/");
Thread.sleep(5000);
driver.manage().window().maximize();
Utility.takeSnapShot(driver,"HomePage.png");
//Utility.takeSnapShot(driver);

//Click Gifts
WebElement header= driver.findElement(By.id("shopify-section-header"));
header.findElement(By.cssSelector("a[href='/collections/gifts']")).click();
Thread.sleep(5000);
Utility.takeSnapShot(driver,"Gifts.png");

//Click Policeman Telephone Box
driver.findElement(By.cssSelector("a[href^='/collections/gifts/products/policeman-telephone-box']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//div[@class='subscribe-popup popup active']//div[@class='popup-close js-class']")).click();
Utility.takeSnapShot(driver,"TelephoneBox.png");

// - IF NEWSLETTER DIALOG OPENS - CLICK X - IF NOT - CONTINUE
/*
//Click Add to Tea Basket
            driver.findElement(By.cssSelector(".product-shop-submit")).click();
            Thread.sleep(2000);            
            driver.findElement(By.xpath("//div[@class='mini-cart-body']")).click();
            JavascriptExecutor js = (JavascriptExecutor)driver;
            WebElement remove = driver.findElement(By.xpath("//div[text()='remove']"));
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='remove']")));
            js.executeScript("argument[0].click();",remove);
            //Take note of Sub Total and export result of exact amount – show in test results
            String pricetext = driver.findElement(By.cssSelector(".mini-cart-total-price")).getText();
            System.out.println(pricetext); 
            
   */
driver.quit();            
}
}