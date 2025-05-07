package com.lucho.code.fitness.activity_service.respository;

import com.lucho.code.fitness.activity_service.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {
}
