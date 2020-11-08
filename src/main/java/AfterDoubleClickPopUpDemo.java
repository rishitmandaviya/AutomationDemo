import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/*
* Jainik Test
* */
public class AfterDoubleClickPopUpDemo extends BaseTest {
    @Test
    public void afterDoubleClickPopUp() throws Exception{
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(1000);
        WebElement afterDoubleClickPopUpDemo = driver.findElement(By.xpath("//input[@name=\"cusid\"]"));
        afterDoubleClickPopUpDemo.sendKeys("xyz@1.com");
        WebElement submit = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
        submit.click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }
}
