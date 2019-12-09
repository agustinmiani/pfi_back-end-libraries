package dto.sport;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

/**
 * Created by amiani on 08/12/2019
 */
public class EventCostDTO extends CostDTO {
    private BigDecimal daylight;
    private BigDecimal night;

    public EventCostDTO(Long id, Date startDate, Date finishDate, Currency currency, BigDecimal daylight, BigDecimal night) {
        super(id, startDate, finishDate, currency);
        this.daylight = daylight;
        this.night = night;
    }

    public EventCostDTO() {
    }

    public BigDecimal getDaylight() {
        return daylight;
    }

    public void setDaylight(BigDecimal daylight) {
        this.daylight = daylight;
    }

    public BigDecimal getNight() {
        return night;
    }

    public void setNight(BigDecimal night) {
        this.night = night;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        EventCostDTO that = (EventCostDTO) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(daylight, that.daylight)
                .append(night, that.night)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(daylight)
                .append(night)
                .toHashCode();
    }
}
