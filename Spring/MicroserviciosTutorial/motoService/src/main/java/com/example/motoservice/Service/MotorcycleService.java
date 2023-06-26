package com.example.motoservice.Service;

import com.example.motoservice.Entities.Motorcycle;
import com.example.motoservice.Repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleService {

    @Autowired
    MotorcycleRepository motorcycleRepository;

    public List<Motorcycle> findAll(){
        return motorcycleRepository.findAll();
    }

    public Motorcycle findMotorcycleById(Integer id){
        return motorcycleRepository.findById( id ).orElse( null );
    }

    public Motorcycle save(Motorcycle moto){
        Motorcycle newMoto = motorcycleRepository.save( moto );
        return newMoto;
    }

    public List<Motorcycle> byUserId( Integer userId){
        return motorcycleRepository.findMotorcycleByUserId( userId );
    }

}
