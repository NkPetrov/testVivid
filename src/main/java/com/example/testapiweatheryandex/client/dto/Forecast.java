package com.example.testapiweatheryandex.client.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Forecast {
    private String date;
    private int date_ts;
    private int week;
    private String sunrise;
    private String sunset;
    private String rise_begin;
    private String set_end;
    private int moon_code;
    private String moon_text;
    private Parts parts;
    private List<Hour> hours;
    private Biomet biomet;
}
