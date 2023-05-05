package com.e.commerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Geolocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String type;

    @ElementCollection
    List<Double> coordinates;

    @ManyToOne
    Nasa nasa;

}
