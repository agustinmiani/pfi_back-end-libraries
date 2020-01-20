package dto.sport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by amiani on 28/12/2019
 */
@Getter
@NoArgsConstructor
@Setter
public class ModifySportFieldPricesDTO {
    private BigDecimal daylight;
    private BigDecimal night;
    private BigDecimal reserve;
}
