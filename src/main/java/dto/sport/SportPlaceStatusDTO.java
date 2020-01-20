package dto.sport;

import entity.sport.SportPlaceStatusReason;
import entity.sport.SportPlaceStatusType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class SportPlaceStatusDTO {

    private SportPlaceStatusType type;
    private SportPlaceStatusReason reason;

}
