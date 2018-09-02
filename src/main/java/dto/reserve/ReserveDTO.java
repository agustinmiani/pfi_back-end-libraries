package dto.reserve;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import dto.sport.PaymentDTO;
import dto.user.UserDTO;
import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
@Setter
public class ReserveDTO {

    private Long id;
    private Date startTime;
    private Date stopTime;
    private ReserveStatusDTO status;
    private List<PaymentDTO> payments;
    private List<UserDTO> participants;
    private UserDTO reserveOwner;
}
