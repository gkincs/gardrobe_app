package org.example.request;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Ez az osztály tartalmazza az Item létrehozásához, vagy frissítéséhez szükséges adatokat.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ItemRequest {
    @NotNull
    @NotEmpty
    private String name;

    @JsonFormat(pattern = "yyyy.MM.dd")
    private LocalDate dateOfWash;

    @JsonFormat(pattern = "yyyy.MM.dd")
    private LocalDate takeOutDate;
}
