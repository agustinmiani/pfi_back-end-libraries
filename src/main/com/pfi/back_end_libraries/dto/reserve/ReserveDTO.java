package com.pfi.back_end_libraries.dto.reserve;

import com.pfi.back_end_libraries.dto.sport.PaymentDTO;
import com.pfi.back_end_libraries.dto.user.UserDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
