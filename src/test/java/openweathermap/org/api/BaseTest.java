package openweathermap.org.api;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

	RequestSpecification commonSpec;

	@BeforeTest(alwaysRun=true)
	public void setup()
	{	
	    commonSpec = new RequestSpecBuilder()
		          .addQueryParam("appid", "e779d70705ae3aa946d1c081f71f4826")
		          .addHeader("ContentType", "application/json")
		          .build();
		RestAssured.baseURI="https://api.openweathermap.org";
		RestAssured.get("https://api.openweathermap.org").prettyPrint();
		
		
	}
}
