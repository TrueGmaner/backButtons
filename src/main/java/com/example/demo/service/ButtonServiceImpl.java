package com.example.demo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class ButtonServiceImpl implements ButtonService {
    private Stack<Integer> inputStack = new Stack<>();
    @Override
    public void addDigit(Integer buttonNumber) {
        inputStack.push(buttonNumber);
    }
    @Override
    public ResponseEntity<String> checkStack(){
        if (inputStack.size() >= 3) {
            int third = inputStack.pop();
            int second = inputStack.pop();
            int first = inputStack.pop();
            if (first == 1 && second == 2 && third == 3) {
                return new ResponseEntity<>("Correct sequence", HttpStatus.OK);
            }
            else return new ResponseEntity<>("Incorrect sequence", HttpStatus.OK);
        }
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @Override
    public void printData() {
        System.out.println(inputStack);
    }
}
