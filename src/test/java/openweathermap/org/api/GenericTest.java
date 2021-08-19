package openweathermap.org.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GenericTest extends BaseTest {
	public static Response getWeatherByCity(String cityname)
	{
		return RestAssured
		          .given()   //PreRequsite/Arrange
		            .queryParam("q", cityname)
		            //.queryParam("appid", "e779d70705ae3aa946d1c081f71f4826")
		            //.pathParam("name", "India")
		          .when()    // Action
		             .get("/data/2.5/weather")
		          .then()    //Assertion
		              .extract().response();
	}
	
	//@Test(enabled=false)
	public static Response getWeatherByID(int cityid)
	{
		return RestAssured
		          .given()   //PreRequsite/Arrange
		            .queryParam("id", cityid)
		            .queryParam("appid", "e779d70705ae3aa946d1c081f71f4826")
		            //.pathParam("name", "India")
		          .when()    // Action
		             .get("/data/2.5/weather")
		          .then()    //Assertion
		              .extract().response();
	}
	
}
