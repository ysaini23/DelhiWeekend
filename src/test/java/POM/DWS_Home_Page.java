package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Home_Page {
public DWS_Home_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//xpaths of home page element
@FindBy(xpath="//input[@id='small-searchterms']")
WebElement search_field;

@FindBy(xpath="//input[@value='Search']")
WebElement search_button;

@FindBy(xpath="//a[@class='hover']")
WebElement books;

@FindBy(xpath="//a[@class='hover']")
WebElement computers;

@FindBy(xpath="//a[@class='hover']")
WebElement electronics;

@FindBy(xpath="//ul[@class='top-menu']//li[4]")
WebElement apperals;

@FindBy(xpath="//a[@class='hover']")
WebElement digital_downloads;

@FindBy(xpath="//a[@class='hover']")
WebElement jewelry;

@FindBy(xpath="//a[@class='ico-register']")
WebElement register;

@FindBy(xpath="//a[@class='ico-login']")
WebElement login;

@FindBy(xpath="//input[@value='Log in']")
WebElement click_login;

@FindBy(xpath="//span[normalize-space()='Shopping cart']")
WebElement shopping_cart;

@FindBy(xpath="//span[normalize-space()='Wishlist']")
WebElement wishlist;

@FindBy(xpath="//a[@class='hover']")
WebElement gift_cards;

//xpaths of register page elements
@FindBy(xpath="//input[@id='FirstName']")
WebElement first_name;

@FindBy(xpath="//input[@id='LastName']")
WebElement last_name;

@FindBy(xpath="//input[@id='Email']")
WebElement email;

@FindBy(xpath="//input[@id='Password']")
WebElement password;

@FindBy(xpath="//input[@id='ConfirmPassword']")
WebElement confirm_password;

@FindBy(xpath="//input[@id='register-button']")
WebElement click_register;

@FindBy(xpath="//input[@id='gender-female']")
WebElement click_female;

public void fname(String value) {
	first_name.sendKeys(value);
}

public void lname(String value) {
	last_name.sendKeys(value);
}

public void email(String value) {
	email.sendKeys(value);
}

public void pwd(String value) {
	password.sendKeys(value);
}
public void confirm_pwd(String value) {
	confirm_password.sendKeys(value);
}

public void search_click() {
	search_button.click();
}


}
