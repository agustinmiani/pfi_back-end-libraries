package com.pfi.back_end_libraries.dto.sport;

import com.pfi.back_end_libraries.entity.sport.SportPlaceStatusReason;
import com.pfi.back_end_libraries.entity.sport.SportPlaceStatusType;
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
