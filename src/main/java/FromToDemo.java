import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FromToDemo extends BaseTest {
    @Test
    public void fromTo() throws Exception{
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);
        WebElement from = driver.findElement(By.xpath("//div[@id=\"products\"]//a[text()=' 5000 ']"));
        WebElement to = driver.findElement(By.xpath("//div[@id=\"shoppingCart4\"]//ol[@id=\"amt7\"]//li[@class=\"placeholder\"]"));
        WebElement from1 = driver.findElement(By.xpath("//div[@id=\"products\"]//a[text()=' BANK ']"));
        WebElement to1 = driver.findElement(By.xpath("//div[@id=\"shoppingCart1\"]//ol[@id=\"bank\"]//li[@class=\"placeholder\"]"));
        Actions actions = new Actions(driver);

        actions.dragAndDrop(from,to).build().perform();

        Thread.sleep(2000);
        actions.dragAndDrop(from1,to1).build().perform();

        Thread.sleep(5000);
    }
}
