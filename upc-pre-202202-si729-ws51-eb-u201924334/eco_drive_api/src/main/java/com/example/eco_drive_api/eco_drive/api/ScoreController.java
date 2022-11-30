package com.example.eco_drive_api.eco_drive.api;

import com.example.eco_drive_api.eco_drive.domain.service.ScoreService;
import com.example.eco_drive_api.eco_drive.mapping.ScoreMapper;
import com.example.eco_drive_api.eco_drive.resources.ScoreResource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/criteria", produces = "application/json")
public class ScoreController {

    private final ScoreService scoreService;

    private final ScoreMapper mapper;


    public ScoreController(ScoreService scoreService, ScoreMapper mapper) {
        this.scoreService = scoreService;
        this.mapper = mapper;
    }

    @GetMapping("{driverId/{scope}}")
    public ScoreResource getAllCriteria(@PathVariable long driverId, @PathVariable int scope) {
        if(scope == 0) {
            ScoreResource scoreResource = new ScoreResource();
            scoreResource.setValue(scoreService.getScoreAverageFromDriverId(driverId));
            return scoreResource;
        } else if(scope == 1) {
            return mapper.toResource(scoreService.getBiggerScoreFromDriverId(driverId));
        }

    }
    @PostMapping()
    public ScoreResource postScore(@PathVariable long driverId) {
        return mapper.toResource(scoreService.getBiggerScoreFromDriverId(driverId));
    }

}