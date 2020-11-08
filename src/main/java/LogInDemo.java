import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogInDemo extends BaseTest {
    @Test 
    public void logInDemo()throws Exception{
        driver.get("http://demo.guru99.com/test/newtours/");
        Thread.sleep(2000);
        WebElement emailId = driver.findElement(By.xpath("//input[@name=\"userName\"]"));
        emailId.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("admin");
        WebElement submit = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
        submit.click();
        Thread.sleep(3000);
    }
}
