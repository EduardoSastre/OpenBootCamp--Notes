package com.example.motoservice.Repository;

import com.example.motoservice.Entities.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Integer> {

    List< Motorcycle > findMotorcycleByUserId (Integer userId );

}
