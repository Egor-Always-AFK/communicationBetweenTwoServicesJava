package ru.sbrf.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    RestTemplate restTemplate = new RestTemplate();

    private final String URLWithoutEndPoint = "http://localhost:8081/coffeemachine";

    @GetMapping("/makeCoffee")
    public BaristaRs makeCoffee(@RequestBody BaristaRq baristaRq) {
        ResponseEntity<?> response = restTemplate.postForEntity(URLWithoutEndPoint + "/getCoffee", baristaRq, Object.class);
        BaristaRs baristaRs = new BaristaRs();
        return baristaRs;
    }
}
