package dto.direction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Currency;
import java.util.Locale;

@Getter
@NoArgsConstructor
@Setter
public class CountryDTO {

    private Long id;
    private String name;
    private Currency currency;
    private Locale locale;
}
