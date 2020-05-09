package dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private String uid;
    private String name;
    private String lastName;
    private UserStatusDTO status;
    private String mail;
    private String profilePictureUrl;
    private Date createdDate;
    private Date lastActivity;
    private String expoPushToken;
    private Boolean eligibleToReceiveNotifications;
}
