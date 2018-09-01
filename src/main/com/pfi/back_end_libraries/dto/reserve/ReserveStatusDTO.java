package com.pfi.back_end_libraries.dto.reserve;

import com.pfi.back_end_libraries.entity.reserve.ReserveStatusReason;
import com.pfi.back_end_libraries.entity.reserve.ReserveStatusType;
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
