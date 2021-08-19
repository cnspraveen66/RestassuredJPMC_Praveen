package com.restassured.workshop.RestassuredJPMC.restcountries;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restcountries {
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://restcountries.eu";
		String resourcepath="/rest/v2/name/{name}";
		String country="India";
		
		Response r =RestAssured
          .given()   //PreRequsite/Arrange
            //.queryParam("sort", "pushed")
            .pathParam("name", "India")
          .when()    // Action
             .get(resourcepath)
          .then()    //Assertion
              .log().all()
              //.extract().response().jsonPath().getList("$");
              .extract().response();
		
		 List<String> countries=r.body().jsonPath().getList("$");
	      System.out.println("Country Name   : " +  countries.size());
	      
		      List<String> countrynames=r.body().jsonPath().getList("name");
		      System.out.println("Country Name   : " +  countrynames);
		      
		    List<Map<String,?>> countryObjects =  r.body().jsonPath().getList("$");
		      for (Map<String, ?> kountry : countryObjects)
		      {
		    	  if(kountry.get("name").equals("India"))
                 {
		    		  String capitalcity = kountry.get("capital").toString();
		    		  if(capitalcity.equals("New Delhi1"))
		    		  {
		    			  System.out.println("Identified Indian Capital which is : "  + capitalcity);
		    		  }
		    		  else
		    		  {
		    			  System.out.println("Expected to be New Delhi, but got  " + kountry.get("capital"));
		    		  }
                 }                
		      }
		//System.out.println("");
	}
//  Response doesn't give India as 1st country. To overcome this issue,
	
}
