package com.example.eco_drive_api.eco_drive.resources;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SaveScoreResource {
    @NotNull
    @NotBlank
    private Float value;
    @NotNull
    @NotBlank
    private Long driverId;
}
