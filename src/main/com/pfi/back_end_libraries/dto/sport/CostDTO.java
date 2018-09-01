package com.pfi.back_end_libraries.dto.sport;

import com.pfi.back_end_libraries.entity.sport.CostType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

@Getter
@NoArgsConstructor
@Setter
public class CostDTO {

    private Long id;
    private Date startDate;

    /**
     * Represents the Date when the Cost of the SportField has changed.
     * When the finishDate is different than null, it means that is not
     * available anymore. (It is not active).
     */
    private Date finishDate;

    private Currency currency;
    private BigDecimal price;

    /**
     * Identifiers if the Cost is reserve or Total
     */
    private CostType costType;
}
