package com.pfi.back_end_libraries.entity.sport;

import lombok.Getter;

@Getter
public enum SportFieldStatusType {

    ACTIVE(1, "active"),
    PENALIZED(2, "penalized"),
    ON_REPAIR(3, "on_repair"),
    DELETED(4, "deleted");

    private Integer code;
    private String name;

    SportFieldStatusType(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a {@link SportFieldStatusType} who matches with given name.
     * @param name
     * @return
     */
    public static SportFieldStatusType findByName(String name) {
        for (SportFieldStatusType st : SportFieldStatusType.values()) {
            if (st.getName().equals(name))
                return st;
        }
        return null;
    }

    /**
     * Returns a {@link SportFieldStatusType} who matches with given code.
     * @param code
     * @return
     */
    public static SportFieldStatusType findByCode(Integer code) {
        for (SportFieldStatusType st : SportFieldStatusType.values()) {
            if (st.getCode().equals(code))
                return st;
        }
        return null;
    }
}
