package getRequests;

import com.utils.PropReader;
import helpers.DataHelper;
import io.restassured.RestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetTestCases {


    @Test
    public void testPostMethod() {
        RestAssured.baseURI = PropReader.readConfig("baseURL");

        given()
                .header("Authorization", DataHelper.getTestData("bearerToken"))
                .when()
                .get("/api/enigma/search/poll/12273209-a6ea-479b-b234-349b949ad0ba")
                .then()
                .log().all().assertThat().statusCode(200);
    }

}
