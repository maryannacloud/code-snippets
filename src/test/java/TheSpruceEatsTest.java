import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TheSpruceEatsTest {

    @Test
    void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.thespruceeats.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement playButton = driver.findElement(By.xpath("//div[@aria-label='Play']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(playButton));

        Actions action = new Actions(driver);
        action.moveToElement(playButton);
        playButton.click();
    }
}
