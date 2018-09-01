package com.pfi.back_end_libraries.dto.sport;

import com.pfi.back_end_libraries.dto.user.UserDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@NoArgsConstructor
@Setter
public class PaymentDTO {

    private Long id;
    private Boolean paid;
    private Date paymentDate;
    private CostDTO cost;
    private UserDTO user;
    private PaymentSourceDTO paymentSource;
}
