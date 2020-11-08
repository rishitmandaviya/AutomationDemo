import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseTest {
    
    WebDriver driver;
    
    @BeforeClass
    public void beforeC(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }    
    
    
    @AfterClass
    public void afterC(){
        driver.quit();
        
    }
}
