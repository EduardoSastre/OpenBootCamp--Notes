package com.example.carservice.Service;

import com.example.carservice.Entities.Car;
import com.example.carservice.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<Car> findAll(){
        return carRepository.findAll();
    }

    public Car findCarById(Integer id){
        return carRepository.findById( id ).orElse( null );
    }

    public Car save(Car car){
        Car newCar = carRepository.save( car );
        return newCar;
    }

    public List<Car> byUserId( Integer userId){
        return carRepository.findCarsByUserId( userId );
    }

}
