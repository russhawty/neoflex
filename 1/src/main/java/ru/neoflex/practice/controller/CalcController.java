package ru.neoflex.practice.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class CalcController {

    @GetMapping("/plus/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }


}