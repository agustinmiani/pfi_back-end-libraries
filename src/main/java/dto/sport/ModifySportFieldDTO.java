package dto.sport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@NoArgsConstructor
@Setter
public class ModifySportFieldDTO {

    private Long id;
    private String name;
    private String description;
    private ModifySportFieldPricesDTO prices;
    private List<String> pictureIds;
}
