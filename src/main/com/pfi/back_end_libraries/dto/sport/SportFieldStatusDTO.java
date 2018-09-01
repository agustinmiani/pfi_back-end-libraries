package com.pfi.back_end_libraries.dto.sport;

import com.pfi.back_end_libraries.entity.sport.SportFieldStatusReason;
import com.pfi.back_end_libraries.entity.sport.SportFieldStatusType;
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
