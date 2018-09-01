package com.pfi.back_end_libraries.entity.sport;

import lombok.Getter;

/**
 * Represents the Payment Type, that can be Personal or Mercadopago
 */
@Getter
public enum PaymentType {

    PERSONAL(1, "personal"),
    MERCADOPAGO(2, "mercadopago");

    private Integer code;
    private String name;

    PaymentType(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a {@link PaymentType} who matches with given name.
     * @param name
     * @return
     */
    public static PaymentType findByName(String name) {
        for (PaymentType p : PaymentType.values()) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }

    /**
     * Returns a {@link PaymentType} who matches with given code.
     * @param code
     * @return
     */
    public static PaymentType findByCode(Integer code) {
        for (PaymentType p : PaymentType.values()) {
            if (p.getCode().equals(code))
                return p;
        }
        return null;
    }
}
