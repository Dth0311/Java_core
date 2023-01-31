package Ex4;

import java.util.Objects;

public class DriverAssignment <Driver, Route>{
    private Driver driver;
    private Route route;
    private int numOfTurn;

    public DriverAssignment() {
    }

    public DriverAssignment(Driver driver) {
        this.driver = driver;
    }

    public DriverAssignment(Driver driver, Route route) {
        this.driver = driver;
        this.route = route;
    }

    public DriverAssignment(Driver driver, Route route, int numOfTurn) {
        this.driver = driver;
        this.route = route;
        this.numOfTurn = numOfTurn;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getNumOfTurn() {
        return numOfTurn;
    }

    public void setNumOfTurn(int numOfTurn) {
        this.numOfTurn = numOfTurn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverAssignment<?, ?> that = (DriverAssignment<?, ?>) o;
        return Objects.equals(driver, that.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver);
    }

    @Override
    public String toString() {
        return "DriverAssignment{" +
                "driver=" + driver +
                ", route=" + route +
                ", numOfTurn=" + numOfTurn +
                '}';
    }
}
