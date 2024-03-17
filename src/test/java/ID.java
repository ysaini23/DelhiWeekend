import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).click();   
		driver.findElement(By.id("small-searchterms")).sendKeys("Bags");
		driver.close();
	}
}

