package ik.web.ijse.Dto;

public class ReservationDto {
    private int resId;
    private String rFrom;
    private String rTo;
    private String rDate;
    private int paymentId;
    private int vehicleId;

    public ReservationDto() {
    }

    public ReservationDto(int resId, String rFrom, String rTo, String rDate, int paymentId, int vehicleId) {
        this.resId = resId;
        this.rFrom = rFrom;
        this.rTo = rTo;
        this.rDate = rDate;
        this.paymentId = paymentId;
        this.vehicleId = vehicleId;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getrFrom() {
        return rFrom;
    }

    public void setrFrom(String rFrom) {
        this.rFrom = rFrom;
    }

    public String getrTo() {
        return rTo;
    }

    public void setrTo(String rTo) {
        this.rTo = rTo;
    }

    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "ReservationDto{" +
                "resId=" + resId +
                ", rFrom='" + rFrom + '\'' +
                ", rTo='" + rTo + '\'' +
                ", rDate='" + rDate + '\'' +
                ", paymentId=" + paymentId +
                ", vehicleId=" + vehicleId +
                '}';
    }
}
