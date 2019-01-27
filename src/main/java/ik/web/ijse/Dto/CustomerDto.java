package ik.web.ijse.Dto;

public class CustomerDto {
    private int id;
    private String nic;
    private String name;
    private int tp;
    private String address;


    public CustomerDto() {
    }

    public CustomerDto(int id) {
        this.id = id;
    }

    public CustomerDto(int id, String nic, String name, int tp, String address) {
        this.id = id;
        this.nic = nic;
        this.name = name;
        this.tp = tp;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", tp=" + tp +
                ", address='" + address + '\'' +
                '}';
    }
}
