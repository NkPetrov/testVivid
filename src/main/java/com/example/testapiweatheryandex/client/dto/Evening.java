package com.example.testapiweatheryandex.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Evening {
    private String _source;
    private int temp_min;
    private int temp_avg;
    private int temp_max;
    private double wind_speed;
    private double wind_gust;
    private String wind_dir;
    private int pressure_mm;
    private int pressure_pa;
    private int humidity;
    private int soil_temp;
    private double soil_moisture;
    private int prec_mm;
    private int prec_prob;
    private int prec_period;
    private double cloudness;
    private int prec_type;
    private int prec_strength;
    private String icon;
    private String condition;
    private int uv_index;
    private int feels_like;
    private String daytime;
    private boolean polar;
}
