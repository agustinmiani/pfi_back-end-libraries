package dto.reserve;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amiani on 2019-09-08
 */
@Builder
@Getter
public class SportFieldReservesDTO {
    @Builder.Default
    private List<ReserveDTO> ownReserves = new ArrayList<ReserveDTO>();
    @Builder.Default
    private List<ReserveDTO> otherReserves = new ArrayList<ReserveDTO>();
}
