package yatraTests;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import yatrapageobjectmodelpkg.yatrahomepage;

@Test

public class yatraTestCases {
	
	public void yatratest() throws Throwable{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		driver.manage().window().maximize();

		
		Thread.sleep(2000);
				
		yatrahomepage home = PageFactory.initElements(driver, yatrahomepage.class);
		
		WebElement origin = home.searchFlightOrigin();
		
		Thread.sleep(2000);

		origin.click();
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[1]/div[1]"));
		city.click();
		
		WebElement destination = home.searchFlightDestination();
		Thread.sleep(5000);
		
                destination.sendKeys("Bangalore (BLR)");
                Thread.sleep(6000);
        
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/div/ul/div/div/div/li[3]/div[1]/p[1]"));
		dest.click();
		
		Thread.sleep(5000);
		
		WebElement date = driver.findElement(By.cssSelector("#BE_flight_origin_date"));
		date.sendKeys("18 Aug'21");
		date.click();
		
	        WebElement clicksearchbtn = home.searchflightBtn();
		clicksearchbtn.click();
		Thread.sleep(3000);

        driver.quit();
	}

}
