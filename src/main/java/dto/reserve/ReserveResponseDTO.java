package dto.reserve;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by amiani on 2019-10-10
 */
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ReserveResponseDTO {
    private AbstractReserveDTO reserve;
}
