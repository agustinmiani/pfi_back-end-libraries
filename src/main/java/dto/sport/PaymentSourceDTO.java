package dto.sport;

import entity.sport.PaymentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class PaymentSourceDTO {

    private Long id;
    private PaymentType paymentType;
}
