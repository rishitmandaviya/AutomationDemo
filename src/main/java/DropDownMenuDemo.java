import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownMenuDemo  extends BaseTest {
    @Test
    public void dropDownMenu() throws Exception{
        driver.get("http://demo.guru99.com/test/radio.html");
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Selenium')]//b[@class=\"caret\"]"));
        element.click();
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.xpath("//a[contains(text(),'Selenium')]//b[@class=\"caret\"]"));

        for (WebElement e : options) {
            if (e.getText().equals("Ajax Demo"));
            e.click();
        }
        Thread.sleep(3000);
    }
}
