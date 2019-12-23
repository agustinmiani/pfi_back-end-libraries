package dto.sport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import entity.sport.Sport;

import java.util.List;
import java.util.Set;

public class ComboSportFieldDTO extends AbstractSportFieldDTO {

    @JsonIgnoreProperties({"name", "capacity", "status", "reserves", "costs", "reserve_costs", "sport", "picture_ids", "require_pay_reserve", "joineable"})
    private List<SportFieldDTO> sportFields;

    public ComboSportFieldDTO(Long id, String name, Integer playersPerTeam, String description, String surface, SportFieldDimentionsDTO dimentions, Set<MatchCostDTO> matchCosts, Set<ReserveCostDTO> reserveCosts, Sport sport, SportFieldStatusDTO status, List<String> pictureIds, List<SportFieldDTO> sportFields) {
        super(id, name, playersPerTeam, description, surface, dimentions, matchCosts, reserveCosts, sport, status, pictureIds);
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
