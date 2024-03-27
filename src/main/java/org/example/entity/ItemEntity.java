package org.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.util.Date;
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
