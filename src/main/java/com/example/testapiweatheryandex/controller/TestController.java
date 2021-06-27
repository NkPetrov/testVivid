package com.example.testapiweatheryandex.controller;

import com.example.testapiweatheryandex.client.TestClient;
import com.example.testapiweatheryandex.client.dto.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestClient testClient;

    @GetMapping("/main")
    public ResponseBody get(){
        return testClient.getTestResponse("e9365df7-b632-4865-baef-41e1c8547e0d",
                "55.75396",
                "37.620393");
    }
}
