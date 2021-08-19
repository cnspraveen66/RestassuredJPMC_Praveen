package com.restassured.workshop.RestassuredJPMC;

import io.restassured.RestAssured;

public class Given_When_Then_WithAsseration_LogAll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://httpbin.org";
		  
		RestAssured
          .given()   //PreRequsite/Arrange
            .queryParam("Company", "JPMC")
          .when()    // Action
             .get("/get")  
          .then()    //Assertion
              .log().all()      // This will used to print hreader and body and other details
              .assertThat().statusCode(200)  // This expected	   // We are not getting any output nor any error means asseartion is working fine
              .and()  // just readability
              .extract().response()  //  
              .prettyPrint();   // It will print only body         
	}
}

/* 
 * Response :
 *  "args": {
        "Company": "JPMC"
    },
    "headers": {         ==> This is a default header sent by Rest assured to Http bin 
 //       "Accept":    /*",  /*
 /*       "Accept-Encoding": "gzip,deflate",
        "Host": "httpbin.org",
        "User-Agent": "Apache-HttpClient/4.5.13 (Java/1.8.0_301)",
        "X-Amzn-Trace-Id": "Root=1-611b9511-6d5af7732d5bc8d16c51a404"
    },
    "origin": "49.206.2.157",
    "url": "https://httpbin.org/get?Company=JPMC"  */
