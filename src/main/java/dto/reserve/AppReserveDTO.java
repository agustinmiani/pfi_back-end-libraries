package dto.reserve;

import dto.sport.PaymentDTO;
import dto.user.UserDTO;

import java.util.List;

public class AppReserveDTO extends AbstractReserveDTO {

    private List<PaymentDTO> payments;
    private List<UserDTO> participants;
    private UserDTO reserveOwner;

    public AppReserveDTO() {
        super();
    }

    public List<PaymentDTO> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentDTO> payments) {
        this.payments = payments;
    }

    public List<UserDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<UserDTO> participants) {
        this.participants = participants;
    }

    public UserDTO getReserveOwner() {
        return reserveOwner;
    }

    public void setReserveOwner(UserDTO reserveOwner) {
        this.reserveOwner = reserveOwner;
    }
}
