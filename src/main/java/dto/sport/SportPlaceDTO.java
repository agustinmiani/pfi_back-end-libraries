package dto.sport;

import com.fasterxml.jackson.annotation.JsonProperty;
import dto.direction.DirectionDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Represents an Sport SportPlace that offers differents AbstractSportFieldDTO. It is placed
 * on a DirectionDTO and attends into a list of AttentionSchedule.
 */
@Getter
@NoArgsConstructor
@Setter
public class SportPlaceDTO {

    private Long id;
    private String name;
    @JsonProperty("user_name")
    private String userName;
    private String password;
    private String mail;
    private SportPlaceStatusDTO status;
    private DirectionDTO direction;
    @JsonProperty("sport_fields")
    private List<AbstractSportFieldDTO> sportFields;
    @JsonProperty("attention_schedules")
    private List<AttentionScheduleDTO> attentionSchedules;
}
