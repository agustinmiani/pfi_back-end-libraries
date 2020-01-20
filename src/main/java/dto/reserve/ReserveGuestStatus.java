package dto.reserve;

import lombok.Getter;

/**
 * Created by amiani on 21/12/2019
 */
@Getter
public enum ReserveGuestStatus {
    WAITING_CONFIRMATION(1, "waiting_confirmation"),
    ACCEPTED(2, "accepted");

    private Integer code;
    private String name;

    ReserveGuestStatus(int code, String name){
        this.code = code;
        this.name = name;
    }
}
