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

    @Test
    public void testFlightPostMethod() {
        RestAssured.baseURI = PropReader.readConfig("baseURL");

        given()
                .contentType(ContentType.JSON)
                .header("Authorization", DataHelper.getTestData("bearerToken"))
                .body("{\"next\":{\"nid\":\"1678377041043203541\",\"get\":[{\"cid\":\"ce0f09a8\",\"info\":{\"uid\":\"cont-amd-sau\",\"code\":\"AMD\",\"chnr\":0}},{\"cid\":\"5f289a7\",\"info\":{\"uid\":\"cont-tf-sau\",\"code\":\"TFN\",\"chnr\":\"FZ\"}},{\"cid\":\"e2618a55\",\"info\":{\"uid\":\"cont-tf-sau\",\"code\":\"TFN\",\"chnr\":\"J9\"}},{\"cid\":\"ddd63d1a\",\"info\":{\"uid\":\"cont-tf-sau\",\"code\":\"TFN\",\"chnr\":\"OV\"}},{\"cid\":\"786b932c\",\"info\":{\"uid\":\"cont-tf-sau\",\"code\":\"TFN\",\"chnr\":\"W6\"}},{\"cid\":\"6e3ffa60\",\"info\":{\"uid\":\"default\",\"code\":\"ONE\",\"chnr\":\"XY\"}},{\"cid\":\"96558587\",\"info\":{\"uid\":\"default\",\"code\":\"ONE\",\"chnr\":\"F3\"}},{\"cid\":\"853313c7\",\"info\":{\"uid\":\"default\",\"code\":\"ONE\",\"chnr\":\"E5\"}},{\"cid\":\"dfb6e2a5\",\"info\":{\"uid\":\"default\",\"code\":\"ONE\",\"chnr\":\"G9\"}}],\"let\":[],\"hashedKey\":\"7540d54d21b892e831795e4837f778eb\"},\"request\":{\"searchType\":\"Roundtrip\",\"isRoundTrip\":true,\"leg\":[{\"index\":0,\"originId\":\"RUH\",\"destinationId\":\"JED\",\"departure\":\"2023-03-09\",\"nearByOriginId\":false,\"nearByDestinationId\":false,\"preferredCabin\":\"Economy\",\"nonstop\":false},{\"index\":1,\"originId\":\"JED\",\"destinationId\":\"RUH\",\"departure\":\"2023-03-10\",\"nearByOriginId\":false,\"nearByDestinationId\":false,\"preferredCabin\":\"Economy\",\"nonstop\":false}],\"preferredAirline\":[],\"pax\":{\"adult\":1,\"totalSeats\":1,\"child\":0,\"infant\":0},\"query\":\"RUH-JED/"+DataHelper.getTestData("checkIn")+"/"+DataHelper.getTestData("checkOut")+"/Economy/1Adult\",\"ticketingType\":\"multi\",\"cabin\":\"Economy\"}}").post("/api/v3/flights/flight/async-search-result")
                .then().log().all().assertThat().statusCode(200);}

        @Test
        public void testAccommodationSearchPostMethod() {
            RestAssured.baseURI = PropReader.readConfig("baseURL");

            given()
                    .contentType(ContentType.JSON)
                    .header("Authorization", DataHelper.getTestData("bearerToken"))
                    .body("{\"searchCriteria\":[{\"lookupTypeId\":2,\"lookupId\":[9]}],\"checkIn\":\"2023-03-09\",\"checkOut\":\"2023-04-02\",\"sortBy\":\"rank\",\"sortOrder\":\"DESC\",\"rankType\":\"dynamic\",\"pageNo\":1,\"pageSize\":10}").post("/api/accommodation/property/search")
                    .then().log().all().assertThat().statusCode(200);

    }


}












//Body
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