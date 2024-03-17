import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();       //ctrl+space bar it will give the suggestions.
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
//		WebElement searchfield=driver.findElement(By.tagName("input"));
//		searchfield.click();
		driver.findElement(By.className("ico-login")).click();
		driver.close();
	}
}
