package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;
    private int series;
    private String vehicleType;

    public Car() {}

    public Car(String model, int series, String vehicleType) {
        this.model = model;
        this.series = series;
        this.vehicleType = vehicleType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
