package co.edu.icesi.zoo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {

    private UUID id;
    private String name;
    private String gender;
    private float weight;
    private Integer age;
    private float height;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime arrivalDate;
    @Nullable
    private UUID fatherId;
    @Nullable
    private UUID motherId;

}