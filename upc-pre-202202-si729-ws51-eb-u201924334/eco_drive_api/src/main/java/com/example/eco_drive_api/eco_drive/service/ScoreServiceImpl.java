package com.example.eco_drive_api.eco_drive.service;

import com.example.eco_drive_api.eco_drive.domain.models.Score;
import com.example.eco_drive_api.eco_drive.domain.repositories.ScoreRepository;
import com.example.eco_drive_api.eco_drive.domain.service.ScoreService;
import com.example.eco_drive_api.shared.exception.ResourceNotFoundException;

public class ScoreServiceImpl implements ScoreService {

    private static final String ENTITY = "Score";

    private final ScoreRepository scoreRepository;

    public ScoreServiceImpl(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public Score getBiggerScoreFromDriverId(long driverId) {
        return scoreRepository.findFirstByDriverIdOrderByValueDesc(driverId).orElseThrow(() -> new ResourceNotFoundException("Oops error has occurred!"));
    }

    @Override
    public Float getScoreAverageFromDriverId(long driverId) {
        return scoreRepository.getAverageById(driverId).orElseThrow(() -> new ResourceNotFoundException("Oops error has occurred!"));
    }
}
