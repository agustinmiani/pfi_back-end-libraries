package com.pfi.back_end_libraries.dto.sport;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class NewSportFieldDTO<T extends AbstractSportFieldDTO> {

    private T sportField;
    private Long placeId;
}
