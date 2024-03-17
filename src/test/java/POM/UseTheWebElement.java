package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseTheWebElement {

	@Test
	public void search() {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/");
	    DWS_Home_Page data = new DWS_Home_Page(driver);
	    //data.search_field.sendKeys("bags");
	    //data.search_button.click();
	//data.search_field("bags");
	//data.search_click();
	    data.register.click();
	    data.fname("yukti");
	    data.lname("saini");
	    data.email("yukti@yopmail.com");
	    data.pwd("yukti@123");
	    data.confirm_pwd("yukti");
	    data.click_female.click();
	    data.click_register.click();
	    
	    data.login.click();
	    data.email("yukti@yopmail.com");
	    data.pwd("yukti@123");
	    data.click_login.click();
	    
	}
}
