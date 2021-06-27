package com.example.testapiweatheryandex.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Info {
    private boolean n;
    private int geoid;
    private String url;
    private double lat;
    private double lon;
    private TzInfo tzinfo;
    private int def_pressure_mm;
    private int def_pressure_pa;
    private String slug;
    private int zoom;
    private boolean nr;
    private boolean ns;
    private boolean nsr;
    private boolean p;
    private boolean f;
    private boolean _h;
}
