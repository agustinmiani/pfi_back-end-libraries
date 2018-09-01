package com.pfi.back_end_libraries.entity.user;

import lombok.Getter;

@Getter
public enum UserStatusType {

    ACTIVE(1, "active"),
    PENALIZED(2, "penalized"),
    DELETED(3, "deleted");

    private Integer code;
    private String name;

    UserStatusType(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a {@link UserStatusType} who matches with given name.
     * @param name
     * @return
     */
    public static UserStatusType findByName(String name) {
        for (UserStatusType us : UserStatusType.values()) {
            if (us.getName().equals(name))
                return us;
        }
        return null;
    }

    /**
     * Returns a {@link UserStatusType} who matches with given code.
     * @param code
     * @return
     */
    public static UserStatusType findByCode(Integer code) {
        for (UserStatusType us : UserStatusType.values()) {
            if (us.getCode().equals(code))
                return us;
        }
        return null;
    }
}
