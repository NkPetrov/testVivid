package com.example.testapiweatheryandex.client.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ResponseBody {
    private int now;
    private Date now_dt;
    private Info info;
    private GeoObject geo_object;
    private Yesterday yesterday;
    private Fact fact;
    private List<Forecast> forecasts;
}
