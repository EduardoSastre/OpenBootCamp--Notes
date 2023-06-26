package com.example.carservice.Controller;

import com.example.carservice.Entities.Car;
import com.example.carservice.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> listCars() {
        List<Car> cars = carService.findAll();

        if ( cars.isEmpty() ){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok( cars );

    }

    @GetMapping("/{id}")
    public ResponseEntity< Car > getCar( @PathVariable Integer id ){
        Car car = carService.findCarById( id );
        if ( car == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok( car );
    }

    @PostMapping
    public ResponseEntity<Car> save ( @RequestBody Car car ){
        Car newCar = carService.save( car );

        return ResponseEntity.ok( newCar );
    }


    @GetMapping("/user/{userId}")
    public ResponseEntity< List<Car> > getAllCarsByUser( @PathVariable Integer userId ){
        List<Car> cars = carService.byUserId( userId );
        if ( cars.isEmpty() ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok( cars );
    }

}
