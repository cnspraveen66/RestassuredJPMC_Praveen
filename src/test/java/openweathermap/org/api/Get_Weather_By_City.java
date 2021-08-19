package openweathermap.org.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Weather_By_City {
	@Test
	public void testWeatherReturnedUsingAPI()
	{
		
		RestAssured
		          .given()   //PreRequsite/Arrange
		            .queryParam("q", "New Delhi")
		            .queryParam("appid", "e779d70705ae3aa946d1c081f71f4826")
		            //.pathParam("name", "India")
		          .when()    // Action
		             .get("/data/2.5/weather")
		          .then()    //Assertion
		              .log().all()
		              .assertThat().statusCode(200);
	}

}
