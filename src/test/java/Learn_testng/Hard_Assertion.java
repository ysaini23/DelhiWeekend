package Learn_testng;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hard_Assertion {
@Test
public void ddws() {
	String expected_result="https://demowebshop.tricentis.com/";
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://demowebshop.tricentis.com/");
String actual_result = driver.getCurrentUrl();
WebElement community_pool = driver.findElement(By.id("pollanswers-1"));
community_pool.click();
assertTrue(community_pool.isSelected());
System.out.println("my script is successful.....");
driver.quit();
}
}
