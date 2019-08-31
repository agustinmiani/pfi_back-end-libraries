package dto.sport;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by amiani on 2019-08-30
 */
public enum SportFieldType {
    COMBO("combo"),
    SIMPLE("simple");

    SportFieldType(String apiName) {
        this.apiName = apiName;
    }

    @JsonValue
    private String apiName;
}
