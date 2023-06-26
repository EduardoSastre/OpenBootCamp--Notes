package com.example.motoservice.Controller;

import com.example.motoservice.Entities.Motorcycle;
import com.example.motoservice.Service.MotorcycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moto")
public class MotorcycleController {

    @Autowired
    MotorcycleService motorcycleService;

    @GetMapping
    public ResponseEntity<List<Motorcycle>> listMotorcycles() {
        List<Motorcycle> motorcycles = motorcycleService.findAll();

        if ( motorcycles.isEmpty() ){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok( motorcycles );

    }

    @GetMapping("/{id}")
    public ResponseEntity< Motorcycle > getMotorcycle( @PathVariable Integer id ){
        Motorcycle moto = motorcycleService.findMotorcycleById( id );
        if ( moto == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok( moto );
    }

    @PostMapping
    public ResponseEntity<Motorcycle> save ( @RequestBody Motorcycle moto ){
        Motorcycle newMoto = motorcycleService.save( moto );

        return ResponseEntity.ok( newMoto );
    }


    @GetMapping("/user/{userId}")
    public ResponseEntity< List<Motorcycle> > getAllCarsByUser( @PathVariable Integer userId ){
        List<Motorcycle> cars = motorcycleService.byUserId( userId );
        if ( cars.isEmpty() ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok( cars );
    }


}
