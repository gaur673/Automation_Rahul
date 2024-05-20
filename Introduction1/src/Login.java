import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
		
		Login lg= new Login();
		// TODO Auto-generated method stub
		String name="rahul";
		
		System.setProperty("Webdriver.chrome.driver", "\"C:/Users/Gaurav/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String pass = lg.getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		
		driver.findElement(By.className("signInBtn")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+ name +",");
		//driver.findElement(By.className("logout-btn")).click();
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//driver.close();
		
	}
	
	
	public String getpassword(WebDriver driver)
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String st= driver.findElement(By.cssSelector("form p")).getText();
		String[] as= st.split("'");
		//System.out.println(as[1]);
		String[] as1= as[1].split("'");
		//System.out.println(as1[0]);
		String pwd=as1[0];
		return pwd;
		
	}
	
	

}
