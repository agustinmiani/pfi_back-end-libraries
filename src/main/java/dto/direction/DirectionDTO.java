package dto.direction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents the Direction of a SportPlace.
 */
@Getter
@NoArgsConstructor
@Setter
public class DirectionDTO {

    private Long id;
    private CoordinatesDTO coordinates;
    private StreetDTO street;
    private ApartmentDTO apartment;
    private CountryDTO country;
}
