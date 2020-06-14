package selcode;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class singledropdown {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "F:\\chrome79\\chromeDriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.qvc.com/");

	driver.manage().window().maximize();
    
	Actions av= new  Actions (driver);
//.moveToElement
	av.doubleClick().build().perform();//left click
	
	av.contextClick().build().perform();// right click
	
	
}
}