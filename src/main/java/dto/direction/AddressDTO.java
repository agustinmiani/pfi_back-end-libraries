package dto.direction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents the Address of a SportPlace.
 */
@Getter
@NoArgsConstructor
@Setter
public class AddressDTO {

    private Long id;
    private CoordinatesDTO coordinates;
    private StreetDTO street;
    private ApartmentDTO apartment;
    private CountryDTO country;
}
