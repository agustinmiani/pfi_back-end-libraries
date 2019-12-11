package dto.sport;

import dto.user.UserDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@NoArgsConstructor
@Setter
public class PaymentDTO {

    private Long id;
    private Boolean paid;
    private Date paymentDate;
    private BigDecimal amount;
    private UserDTO user;
    private PaymentSourceDTO paymentSource;
}
