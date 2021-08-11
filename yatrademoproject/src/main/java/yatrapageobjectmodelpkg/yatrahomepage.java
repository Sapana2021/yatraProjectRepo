package yatrapageobjectmodelpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class yatrahomepage {
	
	WebDriver driver;
	

	public yatrahomepage(WebDriver driver2) {
		
		this.driver = driver2;
		
	}
	

	@FindBy(xpath="//*[@id=\"BE_flight_origin_city\"]")
    WebElement flightOrigin;

	@FindBy(name="flight_destination")
    WebElement flightDestination;
	
	@FindBy(name="flight_origin_date")
    WebElement flightOriginDate;
	
	@FindBy(name="flight_destination_date")
    WebElement flightDestinationDate;
	
	@FindBy(xpath="//*[@id=\"BE_flight_flsearch_btn\"]")
	WebElement flightSearchBtn;
	
	
	public WebElement searchFlightOrigin() 
	{
		return flightOrigin;
	}
	
	public WebElement searchFlightDestination() 
	{
		
		return flightDestination;
	}
	
	public WebElement searchflightBtn() 
	{
		
		return flightSearchBtn;
	}
}
