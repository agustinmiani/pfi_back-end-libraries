package dto.reserve;

public class ReserveDTO extends AbstractReserveDTO {

    private String owner;

    public ReserveDTO() {
        super();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
