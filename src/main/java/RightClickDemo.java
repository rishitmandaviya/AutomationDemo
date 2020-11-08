import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickDemo extends BaseTest {
    @Test
    public void rightClick() throws Exception{
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(2000);
        WebElement rightClickDemo = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickDemo).build().perform();
        Thread.sleep(3000);
    }
}
