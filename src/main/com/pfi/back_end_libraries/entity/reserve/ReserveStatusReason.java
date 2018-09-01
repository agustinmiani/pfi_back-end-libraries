package com.pfi.back_end_libraries.entity.reserve;

import lombok.Getter;

@Getter
public enum ReserveStatusReason {

    FOR_DEBT(1, "for_debt"),
    BY_USER(2, "by_user"),
    BY_PLACE(3, "by_place"),
    BY_WEATHER(4, "by_weather");

    private Integer code;
    private String name;

    ReserveStatusReason(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a {@link ReserveStatusReason} who matches with given name.
     * @param name
     * @return
     */
    public static ReserveStatusReason findByName(String name) {
        for (ReserveStatusReason srr : ReserveStatusReason.values()) {
            if (srr.getName().equals(name))
                return srr;
        }
        return null;
    }

    /**
     * Returns a {@link ReserveStatusReason} who matches with given code.
     * @param code
     * @return
     */
    public static ReserveStatusReason findByCode(Integer code) {
        for (ReserveStatusReason srr : values()) {
            if (srr.getCode().equals(code))
                return srr;
        }
        return null;
    }
}
