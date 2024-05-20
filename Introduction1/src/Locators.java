import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * ID
		 * Xpath  - Are generic locator where we construct these on any html page
		 * CSS Selector - same
		 * name
		 * Class Name
		 * Tag Name
		 * Link Text  --> click on any link
		 * Partial Link Text 
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gaurav/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		driver.findElement(By.className("signInBtn")).click();
		
		// Implicit wait - 5 seconds time out ( to avoid error)
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 	
		// CSS selector
		//<input type="text" placeholder="Username" id="inputUsername" value="">
		// Class name --> tagname.classname --> Button.signInBtn
		// Id--> tagname#id --> input#inputUsername
		// Tagname[attribute='value']  --> Input[placeholder='Username']
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		//   <div class="forgot-pwd-container"><a href="#">Forgot your password?</a></div>
		driver.findElement(By.linkText("Forgot your password?")).click();
       
		
		// Xpath
		//   //Tagname[@attribute='value']
		// <input type="text" placeholder="Name">
		//  //input[@placeholder='Name']
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@rsa.com");
		// or for cssSelector
		//driver.findElement(By.xpath("input[type='text']:nth-child(3)")).sendKeys("john@rsa.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass'")).sendKeys("rahulshettyacademy");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		

	}

}
