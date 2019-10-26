package testApp.model;

import java.io.Serializable;

public class SubwayStation implements Serializable {
    private String id;
    private String x;
    private String y;
    private String peopleToDropOff;
    private String dropOffDestination;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getPeopleToDropOff() {
        return peopleToDropOff;
    }

    public void setPeopleToDropOff(String peopleToDropOff) {
        this.peopleToDropOff = peopleToDropOff;
    }

    public String getDropOffDestination() {
        return dropOffDestination;
    }

    public void setDropOffDestination(String dropOffDestination) {
        this.dropOffDestination = dropOffDestination;
    }
}
