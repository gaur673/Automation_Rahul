

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=5286557580411469593&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9151662&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
		Actions a=new Actions(driver);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[id='nav-link-accountList']")));
		
		WebElement move= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).contextClick().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		
		
		
	
		
	
		
	
	}

}
