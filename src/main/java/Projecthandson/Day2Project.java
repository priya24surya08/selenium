package Projecthandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Day2Project {
    public WebDriver driver;

    @BeforeClass()
    public void login()
    {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://live.techpanda.org/index.php/");
    }
    @Test()
   public void mobile(){
        WebElement mob=driver.findElement(By.linkText("Mobile"));
        mob.click();
    }
    @Test()
    public void sony(){
        WebElement sony=driver.findElement(By.id("product-collection-image-1"));
        sony.click();
    }
    public @AfterClass()
        void quit(){

        driver.quit();
        }
    }

