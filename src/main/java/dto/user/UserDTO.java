package dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dto.direction.AddressDTO;
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
    private String lastName;
    private UserStatusDTO status;
    private AddressDTO address;
    private String mail;
    @JsonIgnoreProperties({"name", "lastName","status", "address", "mail", "friends"})
    private List<UserDTO> friends;

}
