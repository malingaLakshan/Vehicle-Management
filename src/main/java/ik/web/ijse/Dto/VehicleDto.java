package ik.web.ijse.Dto;

public class VehicleDto {


    private int vehicleId;
    private int status;
    private String vehicletype;
    private String fuelType;
    private String automission;
    private double dailyPrice;
    private String disc;



    public VehicleDto() {
    }

    public VehicleDto(int vehicleId, int status, String vehicletype, String fuelType, String automission,
                      double dailyPrice, String disc) {
        this.vehicleId = vehicleId;
        this.status = status;
        this.vehicletype = vehicletype;
        this.fuelType = fuelType;
        this.automission = automission;
        this.dailyPrice = dailyPrice;
        this.disc = disc;
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

    @Override
    public String toString() {
        return "VehicleDto{" +
                "vehicleId=" + vehicleId +
                ", status=" + status +
                ", vehicletype='" + vehicletype + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", automission='" + automission + '\'' +
                ", dailyPrice=" + dailyPrice +
                ", disc='" + disc + '\'' +
                '}';
    }
}
