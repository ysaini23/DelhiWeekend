package Bike_Website;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TVS {
	@Test(groups="smoke")
	public void tvs() {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.tvsmotor.com/");
        //driver.findElement(By.xpath("//img[@class='hover ico_yamaha imageTransition active']")).click();
        driver.close(); 
        Reporter.log("tvs",true);
	}
}
