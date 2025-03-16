package com.acme.shipping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DiscoveryController {

    @GetMapping("/discovery")
    public ResponseEntity<Map<String, Object>> discovery() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "shipping");
        response.put("version", "1.0");
        response.put("owners", List.of("ameerabb", "lonestar"));
        response.put("team", "genAIs");
        response.put("organization", "acme");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
#Generate error conditions     @GetMapping("/live")
    public ResponseEntity<Map<String, String>> live() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "live");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/ready")
    public ResponseEntity<Map<String, String>> ready() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "ready");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
