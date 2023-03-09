package postRequests;
import com.utils.PropReader;
import helpers.DataHelper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import jasonData.PostJasonData;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostTestCase {

    @Test
    public void testPostMethod() {
        RestAssured.baseURI = PropReader.readConfig("baseURL");
        JSONObject requestBody = new JSONObject();
        requestBody.put("checkIn", DataHelper.getTodaysDate());
        requestBody.put("checkOut", DataHelper.getTestData("checkOut"));
        requestBody.put("adultsCount",DataHelper.getTestData("adultsCount"));
        requestBody.put("kidsAges",DataHelper.getTestData("kidsAges"));
        requestBody.put("searchInfo", DataHelper.getTestData("searchInfo"));
        requestBody.put("crossSellDetail", DataHelper.getTestData("crossSellDetail"));
        requestBody.put("placeId", DataHelper.getTestData("placeId"));
        given()
                .contentType(ContentType.JSON)
                .header("Authorization", DataHelper.getTestData("bearerToken"))
                .body(requestBody.toJSONString()).post("/api/enigma/search/async")
                .then().log().all().assertThat().statusCode(200);

    }
}
/*"{\n" +
                        "    \"checkIn\": \"2023-03-23\",\n" +
                        "    \"checkOut\": \"2023-03-24\",\n" +
                        "    \"roomsInfo\": [\n" +
                        "        {\n" +
                        "            \"adultsCount\": 2,\n" +
                        "            \"kidsAges\": []\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"searchInfo\": null,\n" +
                        "    \"crossSellDetail\": null,\n" +
                        "    \"placeId\": \"ChIJr4F5XbhfGxUR6GXc-MAwHGM\"\n" +
                        "}"*/