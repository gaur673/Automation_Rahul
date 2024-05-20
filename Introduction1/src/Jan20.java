import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jan20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// invoking browser
		//Chrome-- ChromeDriver-->Methods
		//FireFox- FirefoxDriver--> methods
		//WebDriver- Interface
		// WebDriver methods + class methods
		//ChromeDriver driver = new ChromeDriver();
		
		// chromedriver.exe--> chrome browser
		// step to invoke chrome driver//
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gaurav/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		//Selenium manager
		//Chrome launch
		/*
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); // current window close
		//driver.quit();// all tab close
		*/
		
		// Firefox launch
		//geckodriver
		/*
		System.setProperty("webdriver.gecko.driver", "C:/Users/Gaurav/Downloads/geckodriver-v0.34.0-win64/geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://rahulshettyacademy.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();	
		*/
		
		// Edge launch
		System.setProperty("webdriver.edge.driver", "C:/Users/Gaurav/Downloads/edgedriver_win64/msedgedriver.exe");
		
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://rahulshettyacademy.com");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.close();

	}

}
 