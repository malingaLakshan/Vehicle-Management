package ik.web.ijse.Dto;

public class PaymentDto {
    private int pId;
    private double cost;
    private String date;
    private int customerId;
    private int reservationId;

    public PaymentDto() {
    }



    public PaymentDto(int customerId) {
        this.customerId = customerId;
    }

    public PaymentDto(int pId, double cost, String date, int customerId, int reservationId) {
        this.pId = pId;
        this.cost = cost;
        this.date = date;
        this.customerId = customerId;
        this.reservationId = reservationId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    @Override
    public String toString() {
        return "PaymentDto{" +
                "pId=" + pId +
                ", cost=" + cost +
                ", date='" + date + '\'' +
                ", customerId=" + customerId +
                ", reservationId=" + reservationId +
                '}';
    }
}
