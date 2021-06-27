package com.example.testapiweatheryandex.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fact {
    @JsonProperty("obs_time")
    private int obsTime;
    private int uptime;
    private int temp;
    @JsonProperty("feels_like")
    private int feelsLike;
    private String icon;
    private String condition;
    private int cloudness;
    @JsonProperty("prec_type")
    private int precType;
    @JsonProperty("prec_prob")
    private int precProb;
    @JsonProperty("prec_strength")
    private int precStrength;
    @JsonProperty("is_thunder")
    private boolean isThunder;
    @JsonProperty("wind_speed")
    private double windSpeed;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("pressure_mm")
    private int pressureMm;
    @JsonProperty("pressure_pa")
    private int pressurePa;
    private int humidity;
    private String daytime;
    private boolean polar;
    private String season;
    private String source;
    @JsonProperty("accum_prec")
    private AccumPrec accumPrec;
    @JsonProperty("soil_moisture")
    private double soilMisture;
    @JsonProperty("soil_temp")
    private int soilTemp;
    @JsonProperty("uv_index")
    private int uvIndex;
    @JsonProperty("wind_gust")
    private double windGust;
}
