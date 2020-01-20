package dto.sport;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public abstract class CostDTO {

    private Long id;
    private Date startDate;

    /**
     * Represents the Date when the Cost of the SportField has changed.
     * When the finishDate is different than null, it means that is not
     * available anymore. (It is not active).
     */
    private Date finishDate;

    private Currency currency;

    public CostDTO(Long id, Date startDate, Date finishDate, Currency currency) {
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.currency = currency;
    }

    public CostDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CostDTO costDTO = (CostDTO) o;

        return new EqualsBuilder()
                .append(id, costDTO.id)
                .append(startDate, costDTO.startDate)
                .append(finishDate, costDTO.finishDate)
                .append(currency, costDTO.currency)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(startDate)
                .append(finishDate)
                .append(currency)
                .toHashCode();
    }
}
