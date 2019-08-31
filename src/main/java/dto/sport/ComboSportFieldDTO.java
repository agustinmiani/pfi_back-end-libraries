package dto.sport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import dto.reserve.ReserveDTO;
import entity.sport.Sport;

import java.util.List;

public class ComboSportFieldDTO extends AbstractSportFieldDTO {

    @JsonIgnoreProperties({"name", "capacity","status", "reserves", "costs", "reserve_costs", "sport", "picture_ids", "require_pay_reserve", "joineable"})
    private List<SportFieldDTO> sportFields;

    public ComboSportFieldDTO(Long id, String name, Integer capacity, SportFieldStatusDTO status, List<ReserveDTO> reserves, List<CostDTO> costs, List<CostDTO> reserveCosts, Sport sport, List<String> pictureIds, Boolean requirePayReserve, List<SportFieldDTO> sportFields) {
        super(id, name, capacity, status, reserves, costs, reserveCosts, sport, pictureIds, requirePayReserve, SportFieldType.COMBO);
        this.sportFields = sportFields;
    }

    public ComboSportFieldDTO() {
        super();
    }

    public List<SportFieldDTO> getSportFields() {
        return sportFields;
    }

    public void setSportFields(List<SportFieldDTO> sportFields) {
        this.sportFields = sportFields;
    }
}
