package com.restassured.workshop.RestassuredJPMC;

import io.restassured.RestAssured;

public class Get_Httpbin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.get("http://httpbin.org/get");
		RestAssured.get("http://httpbin.org/get").prettyPrint();
			
	}

}
