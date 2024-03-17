package Sch_Admin;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Employee_Tab extends Base{
	
@BeforeClass
public void loginBeforeTestClass() {
    login();
}
	
@Test(priority = 1)
public void add_employee() {
	driver.findElement(By.xpath("//a[@class='Employees']")).click();
	driver.findElement(By.id("addEmployee")).click();
}


@Test(priority = 2)
public void add_name() {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.id("FirstName")).sendKeys("abc");
	driver.findElement(By.id("LastName")).sendKeys("aaaa");   
}

@Test(priority = 3)
public void select_dob() {
	driver.findElement(By.id("dob")).click();
	
	{
	WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
    Select select3 = new Select(month); 
    select3.selectByValue("3");
	}
	
	{
	WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
    Select select3 = new Select(year); 
    select3.selectByValue("1980");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, April 8th, 1980']")).click();
	}
}

@Test (priority = 4)
public void select_gender() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement genderDropdown = driver.findElement(By.id("gender")); 
    Select select1 = new Select(genderDropdown); 
    select1.selectByValue("2");
}

@Test (priority = 5)
public void add_email() {
	driver.findElement(By.id("Email")).sendKeys("aaaa@yopmail.com");
}

@Test (priority = 6)
public void add_mobile_number1() {
	driver.findElement(By.name("countryCode")).sendKeys("+91");
	driver.findElement(By.name("mobileNumber")).sendKeys("9755378277");
}


@Test(priority = 7)
public void select_department() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement departmentDropdown = driver.findElement(By.id("department")); 
    Select select2 = new Select(departmentDropdown); 
    select2.selectByValue("321");
}

@Test(priority = 8)
public void select_role() {
	WebElement roleDropdown = driver.findElement(By.id("role")); 
    Select select = new Select(roleDropdown); 
    select.selectByVisibleText("Employee");
}

@Test(priority = 9)
public void select_start_date() {
	driver.findElement(By.id("startDate")).click();
	   for(;;) {
		   try {
				driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, July 17th, 2024']")).click();
				break;
			   } 
		   catch (Exception e) {
		            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		 		    WebElement next = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Next Month']")));
		 		    next.click();
		            			}
			   }
}

@Test(priority = 10)
public void add_annual_allowance() {
	driver.findElement(By.id("AnnualAllowance")).sendKeys("25");
}

@Test(priority = 11)
public void select_hours_or_days() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement hourDropdown = driver.findElement(By.id("hourDays")); 
    Select select3 = new Select(hourDropdown); 
    select3.selectByValue("2");
}

@Test(priority = 12)
public void maximum_leave_carryforward() {
	driver.findElement(By.name("maximumLeaveCarry")).sendKeys("99");
}

@Test(priority = 13)
public void add_designation() {
	driver.findElement(By.name("designation")).sendKeys("Employee");
}

@Test(priority = 14)
public void click_next() {
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("employeeYes")).click();
}

@Test(priority = 15)
public void admin_approver() {
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("employeeYes")).click();
}
//@AfterClass
//public void closedriver(){
//	driver.quit();
//}

}
