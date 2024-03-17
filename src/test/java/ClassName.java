import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();     
		driver.findElement(By.className("cart-label")).click();
		driver.findElement(By.className("wishlist-qty")).click();
		driver.close();
	}
	

}
