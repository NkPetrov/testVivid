package com.example.testapiweatheryandex.client;

import com.example.testapiweatheryandex.client.dto.ResponseBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        url = "https://api.weather.yandex.ru/v2",
        name = "TestQuery"
)
public interface TestClient {
    @GetMapping("/forecast")
    ResponseBody getTestResponse(@RequestHeader("X-Yandex-API-Key") String key,
                                 @RequestParam("lat") String lat,
                                 @RequestParam("lon") String lon
                             );
}
