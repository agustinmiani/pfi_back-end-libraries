package com.pfi.back_end_libraries.entity.user;

import lombok.Getter;

@Getter
public enum UserStatusReason {

    FOR_DEBT(1, "for_debt"),
    OWN_DECISION(2, "own_decision");

    private Integer code;
    private String name;

    UserStatusReason(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a {@link UserStatusReason} who matches with given name.
     * @param name
     * @return
     */
    public static UserStatusReason findByName(String name) {
        for (UserStatusReason sr : values()) {
            if (sr.getName().equals(name))
                return sr;
        }
        return null;
    }

    /**
     * Returns a {@link UserStatusReason} who matches with given code.
     * @param code
     * @return
     */
    public static UserStatusReason findByCode(Integer code) {
        for (UserStatusReason sr : values()) {
            if (sr.getCode().equals(code))
                return sr;
        }
        return null;
    }
}
