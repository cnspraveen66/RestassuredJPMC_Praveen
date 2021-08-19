package trello.functions;

import java.util.List;

import io.restassured.RestAssured;
import trello.common.BaseTest;
public class GetBoardOofThisMember extends BaseTest {
	public static List<String> getBoardOofThisMember()
	{
		String resourcepath = "/1/members/{id}/boards";
		
		List<String> names =RestAssured
		  .given()   //PreRequsite/Arrange
		    .spec(commonSpec)
		    .pathParam("id", "me")
          .when()    // Action
            .get(resourcepath)
          .then()    //Assertion
            .log().all()
            .extract().response()
            .jsonPath().getList("name");
		
		return names;
	}

}
