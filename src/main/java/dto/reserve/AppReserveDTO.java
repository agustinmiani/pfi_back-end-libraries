package dto.reserve;

import dto.sport.PaymentDTO;
import dto.user.UserDTO;

import java.util.List;

public class AppReserveDTO extends AbstractReserveDTO {

    private PaymentDTO payment;
    private List<ReserveGuestDTO> guests;
    private UserDTO reserveOwner;

    public AppReserveDTO() {
        super();
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public List<ReserveGuestDTO> getGuests() {
        return guests;
    }

    public void setGuests(List<ReserveGuestDTO> guests) {
        this.guests = guests;
    }

    public UserDTO getReserveOwner() {
        return reserveOwner;
    }

    public void setReserveOwner(UserDTO reserveOwner) {
        this.reserveOwner = reserveOwner;
    }
}
