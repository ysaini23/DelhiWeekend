import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab1 {
	public static void main(String[] args) throws InterruptedException {
		//new ChromeDriver();                             //ctrl+space bar gives suggestions
		new FirefoxDriver();
//		WebDriver driver=new ChromeDriver();           //we are creating object 
//		driver.manage().window().maximize();   
//		//navigating to demo web shop and verifying it's its URL.
//		String given_url="https://demowebshop.tricentis.com/";
//		driver.navigate().to("https://demowebshop.tricentis.com/");
//		String current_url=driver.getCurrentUrl();
//		if(given_url.equalsIgnoreCase(current_url)) 
//		{
//			System.out.print("Both are same URL of Demowebshop.");
//			
//		}
//		else 
//		{
//			System.out.print("Both are different URL of Demowebshop.");
//		}
//		System.out.println();
//
//	driver.navigate().forward();
//	// navigating to RedBus and verifying it's URL with page title.
//	driver.get("https://www.redbus.in/");
//	//String given_url1="https://www.redbus.in/";
//	String currentURL1=driver.getCurrentUrl();
//    String pageTitle = driver.getTitle();
//    // Define the expected title
//    String expectedTitle = "Bus Tickets Booking Online with Attractive Rates - redBus";
//
//    // Check if the title matches the expected title
//    if (pageTitle.equals(expectedTitle)) {
//        System.out.println("Title is correct: " + pageTitle);
//        System.out.println("URL is: " + currentURL1);
//    } else {
//        System.out.println("Title is incorrect. Actual title is: " + pageTitle);
//        System.out.println("URL is: " + currentURL1);
//    }
//    driver.navigate().refresh();
//    driver.close();
}
}


