package icesi.edu.co.zoodemo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuricatoParentsDTO {
    private UUID id;
    private String name;
    private String gender;
    private float weight;
    private int age;
    private float height;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime arriveDate;
    private SuricatoDTO father;
    private SuricatoDTO mother;

}
