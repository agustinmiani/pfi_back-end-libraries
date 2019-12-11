package dto.sport;

import dto.reserve.AbstractReserveDTO;
import entity.sport.Sport;

import java.util.List;
import java.util.Set;

public class SportFieldDTO extends AbstractSportFieldDTO {

    /**
     * Represents if this Field can be joined in a "Combo" with
     * another ones.
     */
    private Boolean joineable;

    public SportFieldDTO() {
    }

    public SportFieldDTO(Long id, String name, Integer playersPerTeam, String description, String surface, SportFieldDimentionsDTO dimentions, List<AbstractReserveDTO> reserves, Set<MatchCostDTO> matchCosts, Set<ReserveCostDTO> reserveCosts, Sport sport, SportFieldStatusDTO status, List<String> pictureIds, Boolean joineable) {
        super(id, name, playersPerTeam, description, surface, dimentions, reserves, matchCosts, reserveCosts, sport, status, pictureIds);
        this.joineable = joineable;
    }

    public Boolean getJoineable() {
        return joineable;
    }

    public void setJoineable(Boolean joineable) {
        this.joineable = joineable;
    }
}
