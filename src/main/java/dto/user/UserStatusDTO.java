package dto.user;

import entity.user.UserStatusReason;
import entity.user.UserStatusType;
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
