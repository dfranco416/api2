package com.wozu.api2.Repositories;

import com.wozu.api2.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog, Long> {}
