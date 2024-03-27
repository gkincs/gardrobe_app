package org.example.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

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
