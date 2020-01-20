package dto.reserve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by amiani on 30/12/2019
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReserveFieldsDTO {
    List<ReserveFieldsItemDTO> reserveFields;
}
