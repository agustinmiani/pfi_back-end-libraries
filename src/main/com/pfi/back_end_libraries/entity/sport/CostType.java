package com.pfi.back_end_libraries.entity.sport;

import lombok.Getter;

@Getter
public enum CostType {

    RESERVE(1, "reserve"),
    TOTAL(2, "total");

    private Integer code;
    private String name;

    CostType(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a {@link CostType} who matches with given name.
     * @param name
     * @return
     */
    public static CostType findByName(String name) {
        for (CostType c : CostType.values()) {
            if (c.getName().equals(name))
                return c;
        }
        return null;
    }

    /**
     * Returns a {@link CostType} who matches with given code.
     * @param code
     * @return
     */
    public static CostType findByCode(Integer code) {
        for (CostType c : CostType.values()) {
            if (c.getCode().equals(code))
                return c;
        }
        return null;
    }
}
