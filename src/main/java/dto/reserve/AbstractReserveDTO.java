package dto.reserve;

import java.util.Date;

/**
 * Created by amiani on 2019-10-06
 */
public abstract class AbstractReserveDTO {
    private Long id;
    private Date startTime;
    private Date stopTime;
    private ReserveStatusDTO status;

    public AbstractReserveDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public ReserveStatusDTO getStatus() {
        return status;
    }

    public void setStatus(ReserveStatusDTO status) {
        this.status = status;
    }
}
