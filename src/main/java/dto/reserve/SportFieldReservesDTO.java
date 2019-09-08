package dto.reserve;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Created by amiani on 2019-09-08
 */
@Builder
@Getter
public class SportFieldReservesDTO {
    private List<ReserveDTO> ownReserves;
    private List<ReserveDTO> otherReserves;
}
