package com.example.testapiweatheryandex.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hour {
    private String hour;
    @JsonProperty("hour_ts")
    private int hourTs;
    private int temp;
    @JsonProperty("feels_like")
    private int feelsLike;
    private String icon;
    private String condition;
    private double cloudness;
    @JsonProperty("prec_type")
    private int precType;
    @JsonProperty("prec_strength")
    private int precStrength;
    @JsonProperty("is_thunder")
    private boolean isThunder;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("wind_speed")
    private double windSpeed;
    @JsonProperty("wind_gust")
    private double windGust;
    @JsonProperty("pressure_mm")
    private int pressureMm;
    @JsonProperty("pressure_pa")
    private int pressurePa;
    private int humidity;
    @JsonProperty("uv_index")
    private int uvIndex;
    @JsonProperty("soil_temp")
    private int soilTemp;
    @JsonProperty("soil_moisture")
    private double soilMoisture;
    @JsonProperty("prec_mm")
    private int precMm;
    @JsonProperty("prec_period")
    private int precPeriod;
    @JsonProperty("prec_prob")
    private int precProb;
}
