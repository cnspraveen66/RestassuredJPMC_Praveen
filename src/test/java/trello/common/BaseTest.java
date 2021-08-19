package trello.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
	public static RequestSpecification commonSpec;

	@BeforeTest(alwaysRun=true)
	public void setup() throws IOException
	{
		commonSpec = new RequestSpecBuilder()
		 .setBaseUri("https://api.trello.com")
		 .setContentType(ContentType.JSON)
		 .addQueryParam("key", Utilities.getProperty("trellokey"))
         .addQueryParam("token", Utilities.getProperty("trellotoken"))
         .build();
	}	     
	
	
}
