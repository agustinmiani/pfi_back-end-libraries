package com.pfi.back_end_libraries.entity.sport;

import lombok.Getter;

/**
 * Represents all Sports that Supports this Application
 */
@Getter
public enum Sport {

    FOOT_BALL(1, "football", true),
    BASKET(2, "basket", false),
    TENNIS(3, "tennis", false),
    GOLF(4, "golf", false);

    private Integer code;
    private String name;
    private Boolean canJoinFields;

    Sport(Integer code, String name, Boolean canJoinFields){
        this.code = code;
        this.name = name;
        this.canJoinFields = canJoinFields;
    }

    /**
     * Returns a {@link Sport} who matches with given name.
     * @param name
     * @return
     */
    public static Sport findByName(String name) {
        for (Sport s : Sport.values()) {
            if (s.getName().equals(name))
                return s;
        }
        return null;
    }

    /**
     * Returns a {@link Sport} who matches with given code.
     * @param code
     * @return
     */
    public static Sport findByCode(Integer code) {
        for (Sport s : Sport.values()) {
            if (s.getCode().equals(code))
                return s;
        }
        return null;
    }
}
