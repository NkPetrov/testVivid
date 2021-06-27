package com.example.testapiweatheryandex.RestAssured.steps;

import com.example.testapiweatheryandex.client.dto.Fact;
import com.example.testapiweatheryandex.client.dto.ResponseBody;
import com.example.testapiweatheryandex.client.dto.TzInfo;
import com.example.testapiweatheryandex.config.ApiConfig;
import com.example.testapiweatheryandex.config.TestConfigFactory;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class WeatherMethods {
    private static ApiConfig config = TestConfigFactory.getInstance().getApiConfig();

    public static ResponseBody getFullResponse(){

        return given()
                .baseUri(config.getBaseUrl())
                .header("X-Yandex-API-Key", config.getApiKey())
                .param("lat", config.getLat())
                .param("lon", config.getLon())
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getObject("",ResponseBody.class);
    }

    public static TzInfo getTzinfo(){

        return given()
                .baseUri(config.getBaseUrl())
                .header("X-Yandex-API-Key", config.getApiKey())
                .param("lat", config.getLat())
                .param("lon", config.getLon())
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getObject("info.tzinfo",TzInfo.class);
    }

    public static Fact getFact(){

        return given()
                .baseUri(config.getBaseUrl())
                .header("X-Yandex-API-Key", config.getApiKey())
                .param("lat", config.getLat())
                .param("lon", config.getLon())
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .extract().jsonPath().getObject("fact", Fact.class);
    }

}
