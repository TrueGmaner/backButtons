package com.example.demo.controller;

import com.example.demo.service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ButtonController {
    private final ButtonService buttonService;
    @Autowired
    ButtonController(ButtonService buttonService){
        this.buttonService = buttonService;
    }

    @PostMapping(value = "/values/{buttonNumber}")
    public ResponseEntity<String> addDigit(@PathVariable(name = "buttonNumber")Integer buttonNumber){
        buttonService.addDigit(buttonNumber);
        return buttonService.checkStack();
    }

}
