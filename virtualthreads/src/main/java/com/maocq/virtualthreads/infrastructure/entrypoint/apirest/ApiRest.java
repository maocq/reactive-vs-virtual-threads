package com.maocq.virtualthreads.infrastructure.entrypoint.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest {

    @GetMapping("/api/hello")
    String hello() {
        return "Hello world!";
    }
}
