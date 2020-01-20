package dto.reserve;

import dto.user.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by amiani on 21/12/2019
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReserveGuestDTO {
    private Long id;
    private UserDTO user;
    private ReserveGuestStatus status;
}
