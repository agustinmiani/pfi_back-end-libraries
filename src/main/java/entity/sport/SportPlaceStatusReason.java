package entity.sport;

import lombok.Getter;

@Getter
public enum SportPlaceStatusReason {

    FOR_DEBT(1, "for_debt"),
    OWN_DECISION(2, "own_decision");

    private Integer code;
    private String name;

    SportPlaceStatusReason(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a SportPlaceStatusReason who matches with given name.
     * @param name
     * @return
     */
    public static SportPlaceStatusReason findByName(String name) {
        for (SportPlaceStatusReason spsr : values()) {
            if (spsr.getName().equals(name))
                return spsr;
        }
        return null;
    }

    /**
     * Returns a SportPlaceStatusReason who matches with given code.
     * @param code
     * @return
     */
    public static SportPlaceStatusReason findByCode(Integer code) {
        for (SportPlaceStatusReason spsr : values()) {
            if (spsr.getCode().equals(code))
                return spsr;
        }
        return null;
    }
}
