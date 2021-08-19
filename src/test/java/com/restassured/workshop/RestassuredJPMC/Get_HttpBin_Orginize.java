package com.restassured.workshop.RestassuredJPMC;

import io.restassured.RestAssured;

public class Get_HttpBin_Orginize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://httpbin.org";
		RestAssured
		   .get("/get")
		   .prettyPrint();
	}

}
