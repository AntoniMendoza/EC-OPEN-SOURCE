package com.example.eco_drive_api.eco_drive.mapping;

import com.example.eco_drive_api.eco_drive.domain.models.Score;
import com.example.eco_drive_api.eco_drive.resources.SaveScoreResource;
import com.example.eco_drive_api.eco_drive.resources.ScoreResource;
import com.example.eco_drive_api.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class ScoreMapper implements Serializable {

    @Autowired
    EnhancedModelMapper mapper;

    public ScoreResource toResource(Score score) { return mapper.map(score, ScoreResource.class); }

    public Page<ScoreResource> modelListPage(List<Score> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, ScoreResource.class), pageable, modelList.size());
    }

    public Score toModel(SaveScoreResource saveScoreResource) { return mapper.map(saveScoreResource, Score.class); }

}
