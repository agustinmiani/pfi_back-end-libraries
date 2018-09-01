package com.pfi.back_end_libraries.dto.user;

import com.pfi.back_end_libraries.entity.user.UserStatusReason;
import com.pfi.back_end_libraries.entity.user.UserStatusType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserStatusDTO {

    private UserStatusType type;
    private UserStatusReason reason;

}
