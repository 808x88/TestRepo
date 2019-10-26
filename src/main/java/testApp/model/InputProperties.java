package testApp.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class InputProperties implements Serializable {
    private String availableBuses;
    private String programRunTime;
    private String numSubwayStations;
    private String busCapacity;
    private List<SubwayStation> subwayStations;

    public String getAvailableBuses() {
        return availableBuses;
    }

    public void setAvailableBuses(String availableBuses) {
        this.availableBuses = availableBuses;
    }

    public String getProgramRunTime() {
        return programRunTime;
    }

    public void setProgramRunTime(String programRunTime) {
        this.programRunTime = programRunTime;
    }

    public String getNumSubwayStations() {
        return numSubwayStations;
    }

    public void setNumSubwayStations(String numSubwayStations) {
        this.numSubwayStations = numSubwayStations;
    }

    public String getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(String busCapacity) {
        this.busCapacity = busCapacity;
    }

    public List<SubwayStation> getSubwayStations() {
        return subwayStations;
    }

    public void setSubwayStations(List<SubwayStation> subwayStations) {
        this.subwayStations = subwayStations;
    }
}
