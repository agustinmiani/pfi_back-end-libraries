package dto.sport;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by amiani on 2019-09-01
 */
@Builder
@Getter
@Setter
public class SportPlaceFieldsDTO {
    private List<SportFieldDTO> singles;
    private List<ComboSportFieldDTO> comboSportFieldDTOS;
}
