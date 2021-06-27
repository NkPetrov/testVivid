package com.example.testapiweatheryandex.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parts {
    private NightShort night_short;
    private DayShort day_short;
    private Night night;
    private Day day;
    private Evening evening;
    private Morning morning;
}
