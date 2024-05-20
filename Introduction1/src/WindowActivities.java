import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.*;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("Webdriver.chrome.driver",
		// "\"C:/Users/Gaurav/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com"); // component load 100%
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/"); // it not wait to load page fully
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("hello");
		// driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
