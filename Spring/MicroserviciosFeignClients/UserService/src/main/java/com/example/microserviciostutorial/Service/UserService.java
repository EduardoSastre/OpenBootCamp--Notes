package com.example.microserviciostutorial.Service;

import com.example.microserviciostutorial.Entities.User;
import com.example.microserviciostutorial.Models.Car;
import com.example.microserviciostutorial.Models.Motorcycle;
import com.example.microserviciostutorial.Repository.UserRepository;
import com.example.microserviciostutorial.feignClients.CarFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CarFeignClient carFeignClient;

    //////////////////////////////// RestTemplate //////////////////////////////////
    public List<Car> getCars( Integer userId ){

        List<Car> cars = restTemplate.getForObject( "http://localhost:8082/car/user/" + userId, List.class );
        return cars;
    }

    public List<Motorcycle> getMotos(Integer userId ){

        List<Motorcycle> motos = restTemplate.getForObject( "http://localhost:8083/moto/user/" + userId, List.class );
        return motos;
    }

    /////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////// Feign Client //////////////////////////////////

    public Car saveCar( Integer userId, Car car ){

        car.setUserId( userId );
        Car newCar = carFeignClient.save( car );
        return newCar;

    }

    ////////////////////////////////////////////////////////////////////////////////


   public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findUserById(Integer id){
        return userRepository.findById( id ).orElse( null );
    }

    public User saveUser(User user){
       User newUser = userRepository.save( user );
       return newUser;
    }
}
