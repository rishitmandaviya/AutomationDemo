import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickDemo extends BaseTest {
    @Test
    public void doubleClick() throws Exception{
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(2000);
        WebElement doubleClickDemo = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        new Actions(driver).doubleClick(doubleClickDemo).build().perform();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        Thread.sleep(3000);
    }
}
