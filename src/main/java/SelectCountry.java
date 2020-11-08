import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectCountry extends BaseTest {
    @Test
    public void selectCountry() throws Exception{
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
        select.selectByValue("INDIA");
        Thread.sleep(3000);
    }
} 
