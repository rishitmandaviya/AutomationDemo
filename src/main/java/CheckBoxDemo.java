import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
public class CheckBoxDemo extends BaseTest {
    @Test
    public void checkBox() throws Exception{
        driver.get("http://demo.guru99.com/test/radio.html");
        Thread.sleep(1000);
        List<WebElement> checkBoxButton = driver.findElements(By.xpath("//input[@id=\"vfb-6-0\"]"));
        for (WebElement e : checkBoxButton ){
            if (e.getAttribute("value").equals("checkbox1")){
                e.click();
            }
        }
        Thread.sleep(3000);

    }
}
