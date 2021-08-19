package openweathermap.org.api;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Get_Weather_By_City_UsingTestNgMethod extends GenericTest {
	
	
	@Test(enabled=false)
	public void testWeatherReturnedForMumbai()
	{
		int actual = getWeatherByCity("Mumbai").getStatusCode();
		Assert.assertEquals(actual, 200);          
	}
	
	@Test(enabled=false)
	public void testWeatherReturnedForDelhi()
	{
		int actual = getWeatherByCity("New Delhi").getStatusCode();
		Assert.assertEquals(actual, 200);          
	}
	
	@Test(enabled=true)
	public void testGetIDAAndSearchWeather()
	{
		//RestAssured.get("https://api.openweathermap.org").prettyPrint();
	//Search Cityname
		Response res1= getWeatherByCity("Bangalore");
		//Reporter.log(res1);
		System.out.println(res1);
		
	// Extract ID of that city
		int id = res1.jsonPath().getInt("id");
		
	//Search using City ID
		Response res2= getWeatherByID(id);
		System.out.println(res2);
		 
	//  
		String step1weather1 =res1.jsonPath().getString("weather[0].main");
		String step1weather2 =res2.jsonPath().getString("weather[0].main");
		System.out.println("Weather :  " + step1weather1);
		System.out.println("Weather : " + step1weather2);
		Assert.assertEquals(step1weather1, step1weather2);
	}   
	
	

    
}
