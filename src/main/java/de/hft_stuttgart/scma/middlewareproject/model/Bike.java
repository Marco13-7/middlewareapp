package de.hft_stuttgart.scma.middlewareproject.model;


import javax.persistence.*;

@Entity
@Table(name = "bike")
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;

    int power;

    public Bike(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Bike() {

    }
}
