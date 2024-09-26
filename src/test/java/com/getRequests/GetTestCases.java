package com.getRequests;

import com.utils.PropReader;
import helpers.DataHelper;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetTestCases {


    @Test
    public void testGetMethod() {
        RestAssured.baseURI = PropReader.readConfig("baseURL");

        given()
                .header("Authorization", DataHelper.getTestData("bearerToken"))
                .when()
                .get("/api/enigma/search/poll/12273209-a6ea-479b-b234-349b949ad0ba")
                .then()
                .log().all().assertThat().statusCode(200);
    }
    @Test
    public void testGetLastSearchMethod() {
        RestAssured.baseURI = PropReader.readConfig("baseURL");

        given()
                .header("Authorization", DataHelper.getTestData("bearerToken"))
                .when()
                .get("/api/v3/flights/flight/search?query=RUH-JED/2023-03-09/2023-03-10/Economy/1Adult")
                .then()
                .log().all().assertThat().statusCode(200);
    }




}
