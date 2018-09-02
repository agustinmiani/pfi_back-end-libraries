package entity.sport;

import lombok.Getter;

@Getter
public enum SportFieldStatusReason {

    FOR_DEBT(1, "for_debt"),
    OWN_DECISION(2, "own_decision");

    private Integer code;
    private String name;

    SportFieldStatusReason(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a SportFieldStatusReason who matches with given name.
     * @param name
     * @return
     */
    public static SportFieldStatusReason findByName(String name) {
        for (SportFieldStatusReason sr : values()) {
            if (sr.getName().equals(name))
                return sr;
        }
        return null;
    }

    /**
     * Returns a SportFieldStatusReason who matches with given code.
     * @param code
     * @return
     */
    public static SportFieldStatusReason findByCode(Integer code) {
        for (SportFieldStatusReason sr : values()) {
            if (sr.getCode().equals(code))
                return sr;
        }
        return null;
    }
}
