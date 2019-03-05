package dto.sport;

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
    private String userName;
    private String password;
    private String mail;
    private SportPlaceStatusDTO status;
    private DirectionDTO direction;
    private List<AbstractSportFieldDTO> sportFields;
    private List<AttentionScheduleDTO> attentionSchedules;
}
