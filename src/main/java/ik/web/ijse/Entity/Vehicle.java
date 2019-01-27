package ik.web.ijse.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Vehicle implements Serializable {
    @Id
    private int vehicleId;
    private int status;
    private String vehicletype;
    private String fuelType;
    private String automission;
    private double dailyPrice;
    private String disc;

    @OneToOne(mappedBy = "vehicle")
    private Recervation recervation;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, int status, String vehicletype, String fuelType, String automission,
                   double dailyPrice, String disc) {
        this.vehicleId = vehicleId;
        this.status = status;
        this.vehicletype = vehicletype;
        this.fuelType = fuelType;
        this.automission = automission;
        this.dailyPrice = dailyPrice;
        this.disc = disc;
    }

    public Vehicle(int vehicleId, int status, String vehicletype, String fuelType, String automission, double dailyPrice, String disc, Recervation recervation) {
        this.vehicleId = vehicleId;
        this.status = status;
        this.vehicletype = vehicletype;
        this.fuelType = fuelType;
        this.automission = automission;
        this.dailyPrice = dailyPrice;
        this.disc = disc;
        this.recervation = recervation;
    }

    public Vehicle(int vehicleId) {
        this.vehicleId=vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getAutomission() {
        return automission;
    }

    public void setAutomission(String automission) {
        this.automission = automission;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public Recervation getRecervation() {
        return recervation;
    }

    public void setRecervation(Recervation recervation) {
        this.recervation = recervation;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", status=" + status +
                ", vehicletype='" + vehicletype + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", automission='" + automission + '\'' +
                ", dailyPrice=" + dailyPrice +
                ", disc='" + disc + '\'' +
                ", recervation=" + recervation +
                '}';
    }
}
