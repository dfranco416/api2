package com.wozu.api2.Controllers;

import com.wozu.api2.Models.Dog;
import com.wozu.api2.Services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DogController {

    @Autowired
    DogServiceImpl dogServiceImpl;

    @GetMapping("/dog")
    public Dog getDog(){
        return dogServiceImpl.getDogFromDogApi();
    }

    @PostMapping("/create/dog")
    public String postDog(){
        Dog dog = dogServiceImpl.getDogFromDogApi();
        dogServiceImpl.postDogFromDogApi(dog);
        return "posted dog from Api";
    }

}
