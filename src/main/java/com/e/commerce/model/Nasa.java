package com.e.commerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Nasa {

    @Id
    String id;

    String name;

    String nameType;

    String recclass;

    String mass;

    String fall;

    String year;

    String reclat;

    String reclong;

    @OneToMany
    List<Geolocation> geolocation;

}
