package com.wozu.api2.Services;

import com.wozu.api2.Models.Dog;

public interface DogService {

    public Dog getDogFromDogApi();
    public void postDogFromDogApi(Dog dog);
}
