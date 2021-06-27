package com.example.testapiweatheryandex.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeoObject {
    private District district;
    private Locality locality;
    private Province province;
    private Country country;
}
