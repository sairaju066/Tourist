package com.example.tourist.controller;

import com.example.tourist.entity.Tourist;
import com.example.tourist.service.TouristService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {

    private final TouristService touristService;

    @Value("${app.security.token}")
    private String validToken;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping
    public ResponseEntity<?> getAllTourists(
            @RequestHeader(value = "Token", required = false) String token) {

        if (token == null || !validToken.equals(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Unauthorized: Invalid Token Provided");
        }

        List<Tourist> tourists = touristService.getAllTourists();
        return ResponseEntity.ok(tourists);
    }
}
