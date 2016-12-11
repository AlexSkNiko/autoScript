import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.Iterator;
/**
 * Created by Alex on 11.12.2016.
 */
public class FirstScript {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // And now use this to visit Bing
        driver.get("https://www.bing.com/");
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys("automation");
        // Now submit the form
        element.submit();
        // Check the title of the page
        System.out.println("Page header is: " + driver.getTitle());
        // Find the items on the condition: header h2 > link(<a>)
        List<WebElement> elements = driver.findElements(By.xpath("//h2/a"));
        // Print the total number of elements
        System.out.println("Total headers are: " + elements.size());
        // Now using Iterator we will iterate all elements
        Iterator<WebElement> iter = elements.iterator();
        // Print the headers
        while (iter.hasNext()){
            WebElement item = iter.next();
            String header = item.getText();
            System.out.println("Header is: " + header);
        }
        // Close the browser
        driver.quit();
    }
}
