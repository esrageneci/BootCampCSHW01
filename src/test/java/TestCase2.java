import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    //In this class, there are 2 cases. one of them is adding item, other one is to delete the item.
    static String theTestPageURL="https://www.ciceksepeti.com/";
    static WebDriver driver;

    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chrome96");
        driver = new ChromeDriver();
        driver.get(theTestPageURL);
    }//openBrowser

    @Test
    public void Case1() throws InterruptedException {
        //add the product into shopping basket
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //span[@class='icon-close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("deterjan");
        driver.findElement(By.xpath("//span[@class='live-search__text-find']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='BioBellinda Koyu Renklilere Özel Konsantre Sıvı Matik Çamaşır Deterjanı 700 Ml.']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("form#productDetailSend button[type=\"button\"]")).click();
    }

    @Test
    public void Case2() throws InterruptedException {
        //back to shopping
       Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("deterjan");
        driver.findElement(By.xpath("//span[@class='live-search__text-find']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='BioBellinda Koyu Renklilere Özel Konsantre Sıvı Matik Çamaşır Deterjanı 700 Ml.']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("form#productDetailSend button[type=\"button\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("form#shoppingCartForm div.cart__bottom-links > a")).click();

    }
    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }

}
