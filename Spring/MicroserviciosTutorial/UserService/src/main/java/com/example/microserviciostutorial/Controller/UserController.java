package com.example.microserviciostutorial.Controller;

import com.example.microserviciostutorial.Entities.User;
import com.example.microserviciostutorial.Models.Car;
import com.example.microserviciostutorial.Models.Motorcycle;
import com.example.microserviciostutorial.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity< List<User> > listUsers() {
        List<User> users = userService.findAll();

        if ( users.isEmpty() ){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok( users );

    }

    @GetMapping("/{id}")
    public ResponseEntity< User > getUser( @PathVariable Integer id ){
        User user = userService.findUserById( id );
        if ( user == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok( user );
    }

    @PostMapping
    public ResponseEntity<User> saveUser ( @RequestBody User user ){
        User newUser = userService.saveUser( user );

        return ResponseEntity.ok( newUser );
    }

    @GetMapping("/cars/{userId}")
    public ResponseEntity< List<Car> > getCars( @PathVariable Integer userId ){

        User user = userService.findUserById( userId );
        if ( user == null ){
            return ResponseEntity.notFound().build();
        }

        List<Car> cars = userService.getCars( userId );
        return ResponseEntity.ok( cars );
    }

    @GetMapping("/motos/{userId}")
    public ResponseEntity< List<Motorcycle> > getMotos( @PathVariable Integer userId ){

        User user = userService.findUserById( userId );
        if ( user == null ){
            return ResponseEntity.notFound().build();
        }

        List<Motorcycle> motos = userService.getMotos( userId );
        return ResponseEntity.ok( motos );
    }

}
