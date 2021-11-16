package de.hft_stuttgart.scma.middlewareproject.controller;

import de.hft_stuttgart.scma.middlewareproject.model.Bike;
import de.hft_stuttgart.scma.middlewareproject.repository.BikeRepository;
import de.hft_stuttgart.scma.middlewareproject.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BikeApi {

    @Autowired
    private BikeService service;

    @GetMapping("/bikes")
    public List<Bike> getBikes() {
        return service.findAll();
    }

    @PostMapping("/bike/{bike}/{power}")
    public String addBike(@PathVariable String bike, @PathVariable String power) {
        service.addBike(bike, Integer.parseInt(power));
        return "cool";
    }

    @GetMapping("/bike/amount")
    public Long getAmount() {
        return service.count();
    }

}
