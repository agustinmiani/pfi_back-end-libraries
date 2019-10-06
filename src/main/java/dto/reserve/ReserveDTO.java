package dto.reserve;

import dto.sport.PaymentDTO;

public class ReserveDTO extends AbstractReserveDTO {

    private PaymentDTO payment;

    private String owner;

    public ReserveDTO() {
        super();
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
