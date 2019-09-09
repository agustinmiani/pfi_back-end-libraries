package dto.reserve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amiani on 2019-09-08
 */
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class SportFieldReservesDTO {
    private List<ReserveDTO> ownReserves = new ArrayList<ReserveDTO>();
    private List<ReserveDTO> otherReserves = new ArrayList<ReserveDTO>();
}
