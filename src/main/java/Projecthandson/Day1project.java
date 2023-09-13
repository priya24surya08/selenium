package Projecthandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.bouncycastle.asn1.crmf.SinglePubInfo.web;

public class Day1project {

    public static WebDriver driver;
    public static void login() {
    //System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
     driver = new ChromeDriver();
    driver.get("http://live.techpanda.org/index.php/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    String title = driver.getTitle();
    System.out.println(title);
}

    public static void mobilepage()
    {
    WebElement mobile=driver.findElement(By.xpath("(//a[@class='level0 '])[1]"));
    mobile.click();
    String mobilepage=driver.getTitle();
    System.out.println(mobilepage);

}
public static void selection()
{
    WebElement drop=driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
    Select s =new Select(drop);
    s.selectByVisibleText("Name");
    System.out.println(driver.getTitle());
    driver.quit();


}
    public static void main(String[] args) {

        //Day1project pro=new Day1project();
        login();
        mobilepage();
        selection();
    }
}
