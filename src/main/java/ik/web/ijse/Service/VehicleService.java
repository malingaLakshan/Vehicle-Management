package ik.web.ijse.Service;

import ik.web.ijse.Dto.VehicleDto;
import ik.web.ijse.Entity.Customer;
import ik.web.ijse.Entity.Vehicle;

import java.util.List;

public interface VehicleService {
    String saveVehicle(VehicleDto vehicleDto);


    Vehicle searchVehicle(Integer id);

    void deletevehicle(Integer id);

    List<VehicleDto> getAllVehicle();

    String updateVehicle(VehicleDto vehicleDto);
}
