
/*Gireedhar Anil Birajdar*/

package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println("Visited to Facebook website successfully");
		driver.close();
		System.out.println("Test Sucessful");
		}

}
