package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
@RequestMapping(path = "/test")
public class CarController {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Exception occured on request. Exception message: " + exception.getLocalizedMessage());
    }

    @GetMapping("/hello/excepetion")
    public ResponseEntity<Exception> exception() {
        throw new RuntimeException("Test exception");
        //public ResponseEntity<String> printHello() {
        //return ResponseEntity.ok("Hello World!");
    }

//    @GetMapping("/model")
//    public String printModel() {
//        Car car = new Car("Ford","Focus",5);
//        return car.getModel();
//    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> printValue(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello?reqParam={someValue}")
    public ResponseEntity<String> printQuestionValue(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PostMapping ("/model")
    @ResponseBody
    public ResponseEntity<Car> auto() {
        return ResponseEntity.ok(new Car("Ford","Mustang","7"));
    }
}
