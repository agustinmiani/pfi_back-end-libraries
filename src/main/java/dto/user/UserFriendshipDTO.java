package dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dto.friendship.FriendshipStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by amiani on 19/12/2019
 */
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserFriendshipDTO {
    @JsonIgnoreProperties({"status", "address", "friends"})
    private UserDTO friend;
    private FriendshipStatus status;
}
