package dto.reserve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by amiani on 2019-10-10
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReserveResponseDTO {
    private AbstractReserveDTO reserve;
}
