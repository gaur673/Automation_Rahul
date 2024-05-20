import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Gaurav/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		// driver.findElement(By.id("hrefIncChd")).click();
		// driver.findElement(By.id("hrefIncInf")).click();

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Assertion for 5 Adult
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		// //a[@value='BLR'] -xpath for Banglore

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		// (//a[@value='MAA'])[2] - xpath for chennai
		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		// driver.findElement(By.xpath("//a[@value='MAA']")).click();
		// or
		// Parent -child relationship xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		//
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// cssSelector for menu item
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement s : options) {
			if (s.getText().equalsIgnoreCase("India")) {
				s.click();
				break;

			}

		}

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		// using ccsSelector with Regular expression
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// check whether checkbox selected or not
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Count of checkboxes in a page (here we need to use findElements rather than
		// find element
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// Assertion with testng
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// So most common assertion are assertTrue , assertFalse, assertEquals

		// Calenders
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).isEnabled());
		// --not working

		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();

		System.out.println(driver.findElement(By.cssSelector("div[class='picker-second']")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("enable");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
