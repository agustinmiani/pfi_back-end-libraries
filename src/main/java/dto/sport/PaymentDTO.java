package dto.sport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import dto.user.UserDTO;
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
