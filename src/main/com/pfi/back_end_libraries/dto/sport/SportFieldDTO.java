package com.pfi.back_end_libraries.dto.sport;

import com.pfi.back_end_libraries.dto.reserve.ReserveDTO;
import com.pfi.back_end_libraries.entity.sport.Sport;

import java.util.List;

public class SportFieldDTO extends AbstractSportFieldDTO {

    /**
     * Represents if this Field can be joined in a "Combo" with
     * another ones.
     */
    private Boolean joineable;

    public SportFieldDTO(Long id, String name, Integer capacity, SportFieldStatusDTO status, List<ReserveDTO> reserves, List<CostDTO> costs, List<CostDTO> reserveCosts, Sport sport, List<String> pictureIds, Boolean requirePayReserve) {
        super(id, name, capacity, status, reserves, costs, reserveCosts, sport, pictureIds, requirePayReserve);
    }

    public SportFieldDTO() {
        super();
    }

    public Boolean getJoineable() {
        return joineable;
    }

    public void setJoineable(Boolean joineable) {
        this.joineable = joineable;
    }
}
