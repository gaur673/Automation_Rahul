import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String[] vegName = { "Potato", "Cucumber", "Carrot", "Brinjal" };
		int j=0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> vegList = driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for(int i=0;i<vegList.size();i++)
		{
			
			String[] st= vegList.get(i).getText().split(" ");
			String formattedSt=st[0];
			
			List<String> productCompare= Arrays.asList(vegName);
			
			if(productCompare.contains(formattedSt))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if (j==vegName.length)
			{
				break;
			}
			
		}
		
		
		
		

	}

}
