package dto.sport;

import dto.reserve.ReserveDTO;

import entity.sport.Sport;

import java.util.List;

public abstract class AbstractSportFieldDTO {

    protected Long id;
    protected String name;
    protected Integer capacity;
    protected SportFieldStatusDTO status;
    protected List<ReserveDTO> reserves;
    protected List<CostDTO> costs;
    protected List<CostDTO> reserveCosts;
    protected Sport sport;
    protected List<String> pictureIds;
    protected Boolean requirePayReserve;
    private SportFieldType sportFieldType;

    public AbstractSportFieldDTO() {
    }

    public AbstractSportFieldDTO(Long id, String name, Integer capacity, SportFieldStatusDTO status, List<ReserveDTO> reserves, List<CostDTO> costs, List<CostDTO> reserveCosts, Sport sport, List<String> pictureIds, Boolean requirePayReserve, SportFieldType type) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.status = status;
        this.reserves = reserves;
        this.costs = costs;
        this.reserveCosts = reserveCosts;
        this.sport = sport;
        this.pictureIds = pictureIds;
        this.requirePayReserve = requirePayReserve;
        this.sportFieldType = type;
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public SportFieldStatusDTO getStatus() {
        return status;
    }

    public void setStatus(SportFieldStatusDTO status) {
        this.status = status;
    }

    public List<ReserveDTO> getReserves() {
        return reserves;
    }

    public void setReserves(List<ReserveDTO> reserves) {
        this.reserves = reserves;
    }

    public List<CostDTO> getCosts() {
        return costs;
    }

    public void setCosts(List<CostDTO> costs) {
        this.costs = costs;
    }

    public List<CostDTO> getReserveCosts() {
        return reserveCosts;
    }

    public void setReserveCosts(List<CostDTO> reserveCosts) {
        this.reserveCosts = reserveCosts;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public List<String> getPictureIds() {
        return pictureIds;
    }

    public void setPictureIds(List<String> pictureIds) {
        this.pictureIds = pictureIds;
    }

    public Boolean getRequirePayReserve() {
        return requirePayReserve;
    }

    public void setRequirePayReserve(Boolean requirePayReserve) {
        this.requirePayReserve = requirePayReserve;
    }

    public void setSportFieldType(SportFieldType sportFieldType) {
        this.sportFieldType = sportFieldType;
    }

    public SportFieldType getSportFieldType() {
        return sportFieldType;
    }
}
