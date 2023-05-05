package com.e.commerce;

import com.e.commerce.model.Nasa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NasaRepository extends JpaRepository<Nasa, String> {
}
