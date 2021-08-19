package com.restassured.workshop.RestassuredJPMC;

import io.restassured.RestAssured;

public class Get_HttpBin_Orginize_WithParam {
	//Mirroring Service
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://httpbin.org";
		RestAssured
		   .given()
		   .param("company","JPMC")
		   .get("/get")
		   .prettyPrint();
	}

}
