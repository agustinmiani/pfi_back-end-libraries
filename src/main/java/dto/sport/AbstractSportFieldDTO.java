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
    protected List<CostDTO> costs;
    protected List<CostDTO> reserveCosts;
    protected Sport sport;
    private SportFieldStatusDTO status;
    private List<String> pictureIds;
    private Boolean requirePayReserve;

    public AbstractSportFieldDTO() {
    }

    public AbstractSportFieldDTO(Long id, String name, Integer playersPerTeam, String description, String surface, SportFieldDimentionsDTO dimentions, List<AbstractReserveDTO> reserves, List<CostDTO> costs, List<CostDTO> reserveCosts, Sport sport, SportFieldStatusDTO status, List<String> pictureIds, Boolean requirePayReserve) {
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
        this.requirePayReserve = requirePayReserve;
    }

    public Long getId() {
        return id;
    }

    public AbstractSportFieldDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AbstractSportFieldDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPlayersPerTeam() {
        return playersPerTeam;
    }

    public AbstractSportFieldDTO setPlayersPerTeam(Integer playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AbstractSportFieldDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSurface() {
        return surface;
    }

    public AbstractSportFieldDTO setSurface(String surface) {
        this.surface = surface;
        return this;
    }

    public SportFieldDimentionsDTO getDimentions() {
        return dimentions;
    }

    public AbstractSportFieldDTO setDimentions(SportFieldDimentionsDTO dimentions) {
        this.dimentions = dimentions;
        return this;
    }

    public List<AbstractReserveDTO> getReserves() {
        return reserves;
    }

    public AbstractSportFieldDTO setReserves(List<AbstractReserveDTO> reserves) {
        this.reserves = reserves;
        return this;
    }

    public List<CostDTO> getCosts() {
        return costs;
    }

    public AbstractSportFieldDTO setCosts(List<CostDTO> costs) {
        this.costs = costs;
        return this;
    }

    public List<CostDTO> getReserveCosts() {
        return reserveCosts;
    }

    public AbstractSportFieldDTO setReserveCosts(List<CostDTO> reserveCosts) {
        this.reserveCosts = reserveCosts;
        return this;
    }

    public Sport getSport() {
        return sport;
    }

    public AbstractSportFieldDTO setSport(Sport sport) {
        this.sport = sport;
        return this;
    }

    public SportFieldStatusDTO getStatus() {
        return status;
    }

    public AbstractSportFieldDTO setStatus(SportFieldStatusDTO status) {
        this.status = status;
        return this;
    }

    public Boolean getRequirePayReserve() {
        return requirePayReserve;
    }

    public AbstractSportFieldDTO setRequirePayReserve(Boolean requirePayReserve) {
        this.requirePayReserve = requirePayReserve;
        return this;
    }

    public List<String> getPictureIds() {
        return pictureIds;
    }

    public AbstractSportFieldDTO setPictureIds(List<String> pictureIds) {
        this.pictureIds = pictureIds;
        return this;
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
                .append(requirePayReserve, that.requirePayReserve)
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
                .append(requirePayReserve)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "AbstractSportFieldDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", playersPerTeam=" + playersPerTeam +
                ", description='" + description + '\'' +
                ", surface='" + surface + '\'' +
                ", dimentions=" + dimentions +
                ", reserves=" + reserves +
                ", costs=" + costs +
                ", reserveCosts=" + reserveCosts +
                ", sport=" + sport +
                ", status=" + status +
                ", pictureIds=" + pictureIds +
                ", requirePayReserve=" + requirePayReserve +
                '}';
    }
}
