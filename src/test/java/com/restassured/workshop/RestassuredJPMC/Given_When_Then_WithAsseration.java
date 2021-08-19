package com.restassured.workshop.RestassuredJPMC;

import io.restassured.RestAssured;

public class Given_When_Then_WithAsseration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://httpbin.org";
	

		           RestAssured
		               .given()   //PreRequsite/Arrange
		                 .queryParam("Company", "JPMC")
		               .when()    // Action
		                  .get("/get")  
		               .then()    //Assertion
		                   .assertThat().statusCode(200)  // This expected	   // We are not getting any output nor any error means asseartion is working fine
		                   .and()
		                   .extract().response()
		                   .prettyPrint();   // It will print only body
		                   
}
}