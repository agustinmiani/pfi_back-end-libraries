package entity.sport;

import lombok.Getter;

@Getter
public enum SportPlaceStatusType {

    ACTIVE(1, "active"),
    WAITING_CONFIRMATION(2, "waiting_confirmation"),
    PENALIZED(3, "penalized"),
    DELETED(4, "deleted");

    private Integer code;
    private String name;

    SportPlaceStatusType(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a SportPlaceStatusType who matches with given name.
     * @param name
     * @return
     */
    public static SportPlaceStatusType findByName(String name) {
        for (SportPlaceStatusType spst : SportPlaceStatusType.values()) {
            if (spst.getName().equals(name))
                return spst;
        }
        return null;
    }

    /**
     * Returns a SportPlaceStatusType who matches with given code.
     * @param code
     * @return
     */
    public static SportPlaceStatusType findByCode(Integer code) {
        for (SportPlaceStatusType spst : SportPlaceStatusType.values()) {
            if (spst.getCode().equals(code))
                return spst;
        }
        return null;
    }
}
