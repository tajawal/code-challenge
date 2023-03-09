package getRequests;

import io.restassured.RestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetTestCases {


    @Test
    public void testPostMethod() {
        RestAssured.baseURI = "https://www.almosafer.com/api/enigma/search";

        given()
                .header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.NGdyNzFSeHU5WS9LQ2gxdkZSL2NNZGx0OW5Sbnl3VXlFS0NGQmhqRy9wYzBzaG03MUJlbStWb0JjNUd0amN4akdWRWdCbnRjS1g2aUVrZmZ6alZNL1lpK09ER0Y1azJ5T0VGNUZRZzc0RUtHeTdkSXpwYnhJck5Ld3dXVmxRWG9GYXo0QmpTNDhlMzErNUlGM3NDQmMzaGFNM0V3d24wTGk0d2NmTG9LSFFhTGRnYVdGM0lLVTQyMXpCcjFYTEVuNGN1RmFnNWltNG5OMFBGY0gzT1JiMUpXYTBDNkhvcm1SZXdMbWxnbGxsMW5qbU5FMy9sam1VSGZEbUo4NG5jS2xFdTBabWlJK2RBcXNQZ0dnVDNwbEFVVVF5bDMyNVBzejh4TCs1MmFERXUrNzNuUnJvcFcyeGlqREtwb25reUZLZi83UlFoR0g5UVA4UFlyOTlDK3J0YlplTVp0Vm5heU05NU9aS2xsdTVBcDFWdmZhcWdKRFNScjcvRkd6Znk1NkJpS0JhYTVIZzQwaENpbkdKbk1pQT09.n7aHpl6an_A-EdW3I_rHsxBUBdAL3lh1QK-Z3SFJd3s")
                .when()
                .get("/poll/12273209-a6ea-479b-b234-349b949ad0ba")
                .then()
                .log().all().assertThat().statusCode(200);
    }

}
