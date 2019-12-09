package dto.sport;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import dto.reserve.AbstractReserveDTO;

import entity.sport.Sport;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = SportFieldDTO.class, name = "SportField"),
        @JsonSubTypes.Type(value = ComboSportFieldDTO.class, name = "ComboSportField")}
)
public abstract class AbstractSportFieldDTO {

    protected Long id;
    protected String name;
    protected Integer playersPerTeam;
    protected String description;
    protected String surface;
    private SportFieldDimentionsDTO dimentions;
    @JsonIgnore
    protected List<AbstractReserveDTO> reserves;
    protected List<EventCostDTO> costs;
    protected List<ReserveCostDTO> reserveCosts;
    protected Sport sport;
    private SportFieldStatusDTO status;
    private List<String> pictureIds;

    public AbstractSportFieldDTO(Long id, String name, Integer playersPerTeam, String description, String surface, SportFieldDimentionsDTO dimentions, List<AbstractReserveDTO> reserves, List<EventCostDTO> costs, List<ReserveCostDTO> reserveCosts, Sport sport, SportFieldStatusDTO status, List<String> pictureIds) {
        this.id = id;
        this.name = name;
        this.playersPerTeam = playersPerTeam;
        this.description = description;
        this.surface = surface;
        this.dimentions = dimentions;
        this.reserves = reserves;
        this.costs = costs;
        this.reserveCosts = reserveCosts;
        this.sport = sport;
        this.status = status;
        this.pictureIds = pictureIds;
    }

    public AbstractSportFieldDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayersPerTeam() {
        return playersPerTeam;
    }

    public void setPlayersPerTeam(Integer playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public SportFieldDimentionsDTO getDimentions() {
        return dimentions;
    }

    public void setDimentions(SportFieldDimentionsDTO dimentions) {
        this.dimentions = dimentions;
    }

    public List<AbstractReserveDTO> getReserves() {
        return reserves;
    }

    public void setReserves(List<AbstractReserveDTO> reserves) {
        this.reserves = reserves;
    }

    public List<EventCostDTO> getCosts() {
        return costs;
    }

    public void setCosts(List<EventCostDTO> costs) {
        this.costs = costs;
    }

    public List<ReserveCostDTO> getReserveCosts() {
        return reserveCosts;
    }

    public void setReserveCosts(List<ReserveCostDTO> reserveCosts) {
        this.reserveCosts = reserveCosts;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public SportFieldStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SportFieldStatusDTO status) {
        this.status = status;
    }

    public List<String> getPictureIds() {
        return pictureIds;
    }

    public void setPictureIds(List<String> pictureIds) {
        this.pictureIds = pictureIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        AbstractSportFieldDTO that = (AbstractSportFieldDTO) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(name, that.name)
                .append(playersPerTeam, that.playersPerTeam)
                .append(description, that.description)
                .append(surface, that.surface)
                .append(dimentions, that.dimentions)
                .append(reserves, that.reserves)
                .append(costs, that.costs)
                .append(reserveCosts, that.reserveCosts)
                .append(sport, that.sport)
                .append(status, that.status)
                .append(pictureIds, that.pictureIds)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(playersPerTeam)
                .append(description)
                .append(surface)
                .append(dimentions)
                .append(reserves)
                .append(costs)
                .append(reserveCosts)
                .append(sport)
                .append(status)
                .append(pictureIds)
                .toHashCode();
    }
}
