package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

    public class HomePage extends BaseClass {
        WebDriver driver;
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.rightmove.co.uk/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
       // By searchbox = By.xpath("//*[@id=\"_3OuiRnbltQyS534SB4ivLV\"]/div/div/div/div/input");
       By searchbox = By.xpath("//input[@placeholder=\"e.g. 'York', 'NW3', 'NW3 5TY' or 'Waterloo Station'\"]");
       By for_sale = By.xpath("//button[contains(text(),'For Sale')]");



        public void searchBox() {
            driver.findElement(searchbox).sendKeys("EN2 6SZ");

        }
        public void forSale(){
            driver.findElement(for_sale).click();
        }
    }
