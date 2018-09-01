package com.pfi.back_end_libraries.dto.sport;

import com.pfi.back_end_libraries.dto.direction.DirectionDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Represents an Sport SportPlace that offers differents {@link AbstractSportFieldDTO}. It is placed
 * on a {@link DirectionDTO} and attends into a list of {@link AttentionScheduleDTO}.
 */
@Getter
@NoArgsConstructor
@Setter
public class SportPlaceDTO {

    private Long id;
    private String name;
    private String userName;
    private String password;
    private SportPlaceStatusDTO status;
    private DirectionDTO direction;
    private List<AbstractSportFieldDTO> sportFields;
    private List<AttentionScheduleDTO> attentionSchedules;
}
