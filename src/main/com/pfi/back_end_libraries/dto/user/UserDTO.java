package com.pfi.back_end_libraries.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pfi.back_end_libraries.dto.direction.DirectionDTO;
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

    /**
     * This property must be ignored into serialization, but when creates a new User it
     * is necessary to get.
     **/
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private UserStatusDTO status;
    private DirectionDTO direction;
    @JsonIgnoreProperties({"name", "username","status", "direction", "friends"})
    private List<UserDTO> friends;

}
