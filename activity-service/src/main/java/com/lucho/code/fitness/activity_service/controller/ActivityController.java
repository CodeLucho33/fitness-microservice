package com.lucho.code.fitness.activity_service.controller;

import com.lucho.code.fitness.activity_service.dto.ActivityRequest;
import com.lucho.code.fitness.activity_service.dto.ActivityResponse;
import com.lucho.code.fitness.activity_service.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/activities")
public class ActivityController{

    private final ActivityService activityService;
    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request){
        return ResponseEntity.ok(activityService.trackActivity(request));

    }
}
