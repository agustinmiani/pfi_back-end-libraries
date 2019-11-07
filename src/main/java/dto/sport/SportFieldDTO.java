package dto.sport;

import dto.reserve.AbstractReserveDTO;
import dto.reserve.ReserveDTO;
import entity.sport.Sport;

import java.util.List;

public class SportFieldDTO extends AbstractSportFieldDTO {

    /**
     * Represents if this Field can be joined in a "Combo" with
     * another ones.
     */
    private Boolean joineable;

    public SportFieldDTO(Long id, String name, Integer playersPerTeam, String description, String surface, SportFieldDimentionsDTO dimentions, List<AbstractReserveDTO> reserves, List<CostDTO> costs, List<CostDTO> reserveCosts, Sport sport, SportFieldStatusDTO status, List<String> pictureIds, Boolean requirePayReserve, Boolean joineable) {
        super(id, name, playersPerTeam, description, surface, dimentions, reserves, costs, reserveCosts, sport, status, pictureIds, requirePayReserve);
        this.joineable = joineable;
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
