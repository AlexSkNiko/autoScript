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
        // ������� ��������� WebDriver
        WebDriver driver = new FirefoxDriver();
        // ��������� URL, ��������� �������
        driver.get("https://www.bing.com/");
        // ������� ������� �� �������� name
        WebElement element = driver.findElement(By.name("q"));
        // ������ �����
        element.sendKeys("automation");
        // ���������� �����
        element.submit();
        // ������� � ������� ����� ��������
        System.out.println("Page header is: " + driver.getTitle());
        // ������� �������� �� �������: ������� h2 > ������(��� <a>)
        List<WebElement> elements = driver.findElements(By.xpath("//h2/a"));
        //������� � ������� ���������� ��������� ���������
        System.out.println("Total headers are: " + elements.size());
        //������� ��������
        Iterator<WebElement> iter = elements.iterator();
        // ������ ������ ���������� ���� ������������ ����������� ������
        while (iter.hasNext()){
            WebElement item = iter.next();
            String header = item.getText();
            System.out.println("Header is: " + header);
        }
        //��������� �������
        driver.quit();
    }
}
