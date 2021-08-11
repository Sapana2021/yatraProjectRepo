package yatraTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import yatrapageobjectmodelpkg.yatrahomepage;

@Test

public class yatraTestCases {
	
	public void yatratest() throws Throwable{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"BE_flight_flsearch_btn\"]")).click();
		
		yatrahomepage home = new yatrahomepage();
		
//		WebElement origin = home.searchFlightOrigin();
//		
//		origin.click();
//		origin.sendKeys("Mumbai");
		
		WebElement clicksearchbtn = home.searchflightBtn();
		clicksearchbtn.click();
				
		//Thread.sleep(2000);

	}

}
