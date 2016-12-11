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
        // Создаем экземпляр WebDriver
        WebDriver driver = new FirefoxDriver();
        // Открываем URL, используя драйвер
        driver.get("https://www.bing.com/");
        // Находим элемент по атрибуту name
        WebElement element = driver.findElement(By.name("q"));
        // Вводим текст
        element.sendKeys("automation");
        // Отправляем форму
        element.submit();
        // Выводим в консоль тайтл страницы
        System.out.println("Page header is: " + driver.getTitle());
        // Находим элементы по условию: заголов h2 > ссылка(тег <a>)
        List<WebElement> elements = driver.findElements(By.xpath("//h2/a"));
        //Выводим в консоль количество найденных элементов
        System.out.println("Total headers are: " + elements.size());
        //Создаем итератор
        Iterator<WebElement> iter = elements.iterator();
        // Печать списка заголовков всех отображаемых результатов поиска
        while (iter.hasNext()){
            WebElement item = iter.next();
            String header = item.getText();
            System.out.println("Header is: " + header);
        }
        //Закрываем браузер
        driver.quit();
    }
}
