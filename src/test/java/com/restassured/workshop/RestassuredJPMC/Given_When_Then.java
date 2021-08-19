package com.restassured.workshop.RestassuredJPMC;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;

public class Given_When_Then {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://httpbin.org";
		
		RestAssured
		   .given()
		      .param("Company", "JPMC")  //Defaut to Query param
		      .header("MyHeader1","Custom Header Value 1")
              .cookie("MyHeader1","Custom Header Value 1")
            .when()
              .get("/get")
            .then()
              .extract()
              .response()
              .prettyPrint();
		   
		
	}

}
