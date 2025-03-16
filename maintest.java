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
#Generate  test conditions    @GetMapping("/")
    public ResponseEntity<String> root() {
        return new ResponseEntity<>("Hello, World!", HttpStatus.OK);
    }
#Write sorting algorithms    // Example of a sorting algorithm (Bubble Sort)
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Example of another sorting algorithm (Insertion Sort)
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
#Generate new errors conditions    @GetMapping("/error")
    public ResponseEntity<Map<String, String>> error() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "error");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/notfound")
    public ResponseEntity<Map<String, String>> notFound() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "not found");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
