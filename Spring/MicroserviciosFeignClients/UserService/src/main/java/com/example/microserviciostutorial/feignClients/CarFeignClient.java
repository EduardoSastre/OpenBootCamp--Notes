package com.example.microserviciostutorial.feignClients;

import com.example.microserviciostutorial.Models.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient( name = "carService", url = "http://localhost:8082" )
@RequestMapping("/car")
public interface CarFeignClient {

    @PostMapping
    public Car save (@RequestBody Car car );

}
