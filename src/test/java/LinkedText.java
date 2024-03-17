import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//driver.findElement(By.linkText("Register")).click();   
		driver.findElement(By.partialLinkText("Shopping")).click();
		driver.close();
	}
}
