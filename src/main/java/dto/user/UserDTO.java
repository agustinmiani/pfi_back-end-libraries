package dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dto.direction.DirectionDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String username;
    private String password;
    private UserStatusDTO status;
    private DirectionDTO direction;
    private DirectionDTO mail;
    @JsonIgnoreProperties({"name", "username","status", "direction", "friends"})
    private List<UserDTO> friends;

}
