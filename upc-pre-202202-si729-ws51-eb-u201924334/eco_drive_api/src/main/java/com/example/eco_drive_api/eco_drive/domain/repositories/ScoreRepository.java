package com.example.eco_drive_api.eco_drive.domain.repositories;

import com.example.eco_drive_api.eco_drive.domain.models.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
    Optional<Score> findFirstByDriverIdOrderByValueDesc(long driverId);
    @Query("SELECT AVG(s.value) FROM Score s WHERE s.id = :#{#.driverId}")
    Optional<Double> getAverageById(@Param("driverId")long driverId);
}
