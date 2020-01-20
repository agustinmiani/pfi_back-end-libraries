package dto.sport;

import entity.sport.SportFieldStatusReason;
import entity.sport.SportFieldStatusType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class SportFieldStatusDTO {

    private SportFieldStatusType type;
    private SportFieldStatusReason reason;
}
