package com.example.eco_drive_api.eco_drive.resources;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class ShowScoreResource {

    private Long Id;
    private Long driverId;
    private Float value;
    private Date registeredAt;
}
