import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class RadioButtonDemo extends BaseTest {
    @Test
    public void radio() throws Exception{
        driver.get("http://demo.guru99.com/test/radio.html");
        Thread.sleep(1000);
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
        radioButton.click();
        Thread.sleep(3000);
    }
}
