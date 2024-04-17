package org.example.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 *Ez az osztály az Item adattárolásáért és reprezentálásáért felelős az adatbázisban.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity

public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PositiveOrZero
    private Long id;

    @NotNull
    @NotEmpty
    private String name;

    @JsonFormat(pattern = "yyyy.MM.dd")
    private  LocalDate dateOfWash;

    @JsonFormat(pattern = "yyyy.MM.dd")
    private LocalDate takeOutDate;
}
