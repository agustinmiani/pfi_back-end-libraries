package dto.sport;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

/**
 * Created by amiani on 08/12/2019
 */
public class ReserveCostDTO extends CostDTO {
    private BigDecimal amount;

    public ReserveCostDTO(Long id, Date startDate, Date finishDate, Currency currency, BigDecimal amount) {
        super(id, startDate, finishDate, currency);
        this.amount = amount;
    }

    public ReserveCostDTO() {
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ReserveCostDTO that = (ReserveCostDTO) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(amount, that.amount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(amount)
                .toHashCode();
    }
}
