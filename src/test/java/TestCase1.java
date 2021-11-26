import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
  //In this class, there are 2 cases. one of them is searching, other one is to clear search history.

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
    //check the searching
      Thread.sleep(2000);
      driver.findElement(By.xpath(" //span[@class='icon-close']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("çikolata");
      driver.findElement(By.xpath("//span[@class='live-search__text-find']")).click();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).clear();
    }


    @Test
    public void Case2() throws InterruptedException {
    //clear search box
      Thread.sleep(2000);
      driver.findElement(By.xpath(" //span[@class='icon-close']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("çikolata");
      driver.findElement(By.xpath("//span[@class='live-search__text-find']")).click();
      driver.findElement(By.xpath("//input[@type=\"text\"]")).clear();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@type=\"text\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[@class='product-search__clear-button js-recent-search-clear-button']")).click();
    }
    @AfterClass
    public static void closeBrowser(){
      driver.quit();
  }
}
