import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class DualWindowDemo extends BaseTest {
    @Test
    public void dualWindow() throws Exception{
        driver.get("http://demo.guru99.com/popup.php");
        Thread.sleep(2000);
        WebElement dualWindowDemo = driver.findElement(By.xpath("//a[text() = 'Click Here']"));
        dualWindowDemo.click();
        Thread.sleep(5000);
        
        String mainWindow = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> iterator = s.iterator();
        
        while (iterator.hasNext()){
            String childWindow = iterator.next();
            if (!mainWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys("xyz@1.com");
                driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        Thread.sleep(3000);
    }
}
