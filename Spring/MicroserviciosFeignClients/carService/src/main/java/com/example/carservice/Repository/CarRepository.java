package com.example.carservice.Repository;

import com.example.carservice.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository< Car, Integer> {

    List< Car > findCarsByUserId ( Integer userId );


}
