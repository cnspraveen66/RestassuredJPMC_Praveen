package com.restassured.workshop.RestassuredJPMC;

import io.restassured.RestAssured;

public class Given_when_Then_WihLogAll 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://api.github.com";
		  
		String resourcePath = "/users/{username}/repos";
		String user="Swamy";
		RestAssured
          .given()   //PreRequsite/Arrange
            .queryParam("sort", "pushed")
            .pathParam("username", user)
          .when()    // Action
             .get(resourcePath)
          .then()    //Assertion
              .log().all()      // This will used to print hreader and body and other details
              .assertThat().statusCode(200)  // This expected   // We are not getting any output nor any error means asseartion is working fine
              .assertThat().contentType("application/json");   //  is type of header
              /* .and()  // just readability
              .extract().response()  //  
              .prettyPrint();   */ // It will print only body         
	}
}
