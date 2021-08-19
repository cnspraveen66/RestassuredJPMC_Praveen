package trello.functions;

import io.restassured.RestAssured;
import trello.common.BaseTest;
import trello.tests.POST_CreateBoard_Test;

public class CreateBoard extends BaseTest{
	public static int createNewBoard(String board)
	{
int statuscode= RestAssured
		 	.given()
		 	   .spec(commonSpec)
		 	   .queryParam("name", board)
		 	  .when()
		 	    .post("/1/boards/")
		 	  .then()
		 	     .log().all()
                 .extract().response().statusCode();

		 return statuscode;	   
	}



}
