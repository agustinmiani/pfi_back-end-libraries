package dto.reserve;

import entity.reserve.ReserveStatusReason;
import entity.reserve.ReserveStatusType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class ReserveStatusDTO {

    private ReserveStatusType type;
    private ReserveStatusReason reason;
}
