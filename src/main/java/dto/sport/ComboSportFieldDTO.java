package dto.sport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import dto.reserve.AbstractReserveDTO;
import dto.reserve.ReserveDTO;
import entity.sport.Sport;

import java.util.List;

public class ComboSportFieldDTO extends AbstractSportFieldDTO {

    @JsonIgnoreProperties({"name", "capacity","status", "reserves", "costs", "reserve_costs", "sport", "picture_ids", "require_pay_reserve", "joineable"})
    private List<SportFieldDTO> sportFields;

    public ComboSportFieldDTO(List<SportFieldDTO> sportFields) {
        this.sportFields = sportFields;
    }

    public ComboSportFieldDTO(Long id, String name, Integer playersPerTeam, String description, String surface, SportFieldDimentionsDTO dimentions, List<AbstractReserveDTO> reserves, List<CostDTO> costs, List<CostDTO> reserveCosts, Sport sport, SportFieldStatusDTO status, List<String> pictureIds, SportFieldType sportFieldType, Boolean requirePayReserve, List<SportFieldDTO> sportFields) {
        super(id, name, playersPerTeam, description, surface, dimentions, reserves, costs, reserveCosts, sport, status, pictureIds, sportFieldType, requirePayReserve);
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
