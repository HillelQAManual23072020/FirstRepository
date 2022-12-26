import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings

{
    ChromeDriver driver = new ChromeDriver();
    @Before
    public void beforeTest()
    {
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
        driver.get("https://loveandlive.ua/");
    }

    @After
    public void afterTest()
    {
        driver.quit(); // close browser
    }
}
