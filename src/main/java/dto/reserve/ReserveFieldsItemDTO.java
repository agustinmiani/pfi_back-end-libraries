package dto.reserve;

import dto.sport.AbstractSportFieldDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by amiani on 30/12/2019
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReserveFieldsItemDTO {
    private Long reserveId;
    private AbstractSportFieldDTO sportField;
}
