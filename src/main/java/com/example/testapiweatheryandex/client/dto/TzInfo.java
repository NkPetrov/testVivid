package com.example.testapiweatheryandex.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TzInfo {
    private String name;
    private String abbr;
    private boolean dst;
    private int offset;
}
