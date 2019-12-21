package dto.reserve;

import dto.sport.PaymentDTO;
import dto.user.UserDTO;

import java.util.List;

public class AppReserveDTO extends AbstractReserveDTO {

    private List<PaymentDTO> payments;
    private List<ReserveGuestDTO> guests;
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
