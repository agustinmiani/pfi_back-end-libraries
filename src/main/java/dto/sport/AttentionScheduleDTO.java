package dto.sport;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
@NoArgsConstructor
@Setter
public class AttentionScheduleDTO {

    private Long id;
    private DayOfWeek dayOfWeek;
    @JsonFormat(pattern="HH:mm")
    private LocalTime startTime;
    @JsonFormat(pattern="HH:mm")
    private LocalTime stopTime;

}
