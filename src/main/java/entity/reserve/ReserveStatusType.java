package entity.reserve;

import lombok.Getter;

@Getter
public enum ReserveStatusType {

    ACTIVE(1, "active"),
    CANCELED(2, "canceled"),
    FINISHED(3, "finished");

    private Integer code;
    private String name;

    ReserveStatusType(Integer code, String name){
        this.code = code;
        this.name = name;
    }

    /**
     * Returns a ReserveStatusType who matches with given name.
     * @param name
     * @return
     */
    public static ReserveStatusType findByName(String name) {
        for (ReserveStatusType rst : ReserveStatusType.values()) {
            if (rst.getName().equals(name))
                return rst;
        }
        return null;
    }

    /**
     * Returns a ReserveStatusType who matches with given code.
     * @param code
     * @return
     */
    public static ReserveStatusType findByCode(Integer code) {
        for (ReserveStatusType rst : ReserveStatusType.values()) {
            if (rst.getCode().equals(code))
                return rst;
        }
        return null;
    }
}
