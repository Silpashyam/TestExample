package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("First maven project");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Silpa\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com//");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//////// Url verification
		String temp = driver.getCurrentUrl();
		if(temp.contains("https://www.seleniumeasy.com/test/"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		/////////// title verification
		
		String title = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
		String titlefromapp = driver.getTitle();
		if(titlefromapp.contains(title))
		{
			System.out.println("title pass");
		}
		else
		{
			System.out.println("title fail");
		}
		driver.close();
		
	}
}
