package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/homework")
public class SamController {

    @GetMapping("/{jeden}")
    public ResponseEntity<String> printJeden(@PathVariable String jeden) {
        return ResponseEntity.ok(jeden);
    }


    @PutMapping("/dwa/{cos}")
    public ResponseEntity<Car> dwaAuto(@PathVariable String cos, @RequestBody Car car) {
        car.setGears(cos);
        return ResponseEntity.ok(car);
    }

    @PostMapping ("/trzy")
    public ResponseEntity<Car> auto(@RequestBody Car car) {
        return ResponseEntity.ok(new Car("Ford","Mustang","7"));
    }

    @DeleteMapping("/cztery/{abc}")
    public ResponseEntity<String> deleteByName(@PathVariable("abc") String abc) {
        return ResponseEntity.ok("");
    }
}
