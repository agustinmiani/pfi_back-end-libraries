package dto.user;

import dto.direction.AddressDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private String uid;
    private String name;
    private String lastName;
    private UserStatusDTO status;
    private AddressDTO address;
    private String mail;
}
