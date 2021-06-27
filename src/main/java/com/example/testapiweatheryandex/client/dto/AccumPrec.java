package com.example.testapiweatheryandex.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccumPrec {
    @JsonProperty("3")
    private int _3;
    @JsonProperty("7")
    private int _7;
    @JsonProperty("1")
    private int _1;
}
