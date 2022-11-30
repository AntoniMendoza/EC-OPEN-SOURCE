package com.example.eco_drive_api.eco_drive.domain.models;

import com.example.eco_drive_api.shared.domain.model.AuditModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@With
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "score")
public class Score extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private Long driverId;

    @NotNull
    @NotBlank
    private Float value;

    @NotNull
    @NotBlank
    private Date registeredAt;

}