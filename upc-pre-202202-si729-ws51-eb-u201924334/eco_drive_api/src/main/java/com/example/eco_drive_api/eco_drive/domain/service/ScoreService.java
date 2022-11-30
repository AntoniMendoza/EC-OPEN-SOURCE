package com.example.eco_drive_api.eco_drive.domain.service;

import com.example.eco_drive_api.eco_drive.domain.models.Score;

public interface ScoreService {
    Score getBiggerScoreFromDriverId(long driverId);
    Float getScoreAverageFromDriverId(long driverId);
}
