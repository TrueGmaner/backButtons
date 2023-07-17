package com.example.demo.service;

import org.springframework.http.ResponseEntity;

public interface ButtonService {
    void addDigit(Integer buttonNumber);

    ResponseEntity<String> checkStack();
    void printData();
}
