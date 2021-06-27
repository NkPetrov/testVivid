package com.example.testapiweatheryandex.RestAssured;

import com.example.testapiweatheryandex.RestAssured.steps.WeatherMethods;
import com.example.testapiweatheryandex.client.dto.Fact;
import com.example.testapiweatheryandex.client.dto.TzInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RestAssuredTests {

    @Test
    @DisplayName("Проверка аббревиатуры города")
    public void isEqualsMSK() {
        assertThat(WeatherMethods.getTzinfo())
                .isNotNull()
                .extracting(TzInfo::getAbbr).isEqualTo("MSK");
    }

    @Test
    @DisplayName("Проверка наличия температуре в ответе")
    public void tempIsNotNull() {
        assertThat(WeatherMethods.getFact())
                .isNotNull()
                .extracting(Fact::getTemp).isNotNull();
    }

}
