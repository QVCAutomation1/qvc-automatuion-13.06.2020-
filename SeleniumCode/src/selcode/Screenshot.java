package selcode;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.graph.ElementOrder.Type;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "F:\\chrome79\\chromeDriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.qvc.com/");
//		
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//driver.close ();
		

ArrayList <Integer>arr=new ArrayList<Integer>();
arr.add(23);
arr.add(45);
arr.add(34);
arr.add(56);
arr.add(67);
arr.add(90);
arr.add(67);
 int a=arr.size();
for(int i=0;i<a;i++) {
if(i==0) {
	System.out.println(arr.get(0));
	System.out.println(arr.get(4));
}
//System.out.println(arr.get(2));

	 
}		

}
}


//e