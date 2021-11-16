package de.hft_stuttgart.scma.middlewareproject.service;

import de.hft_stuttgart.scma.middlewareproject.model.Bike;
import de.hft_stuttgart.scma.middlewareproject.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class BikeService {

    @Autowired
    private BikeRepository repository;

    public List<Bike> findAll() {

        Iterable<Bike> iterableItems = repository.findAll();

        ArrayList<Bike> bikes = new ArrayList<Bike>();

        Iterator<Bike> itemTerator = iterableItems.iterator();
        while(itemTerator.hasNext()){
            Bike tempItem = itemTerator.next();
            bikes.add(tempItem);
        }



        return bikes;
    }

    public Long count() {

        return repository.count();
    }

    public void deleteById(Long userId) {

        repository.deleteById(userId);
    }

    public void addBike(String bike, int power) {
        repository.save(new Bike(bike, power));
    }
}
