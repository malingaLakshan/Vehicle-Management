package ik.web.ijse.Controller;

import ik.web.ijse.Dto.CustomerDto;
import ik.web.ijse.Dto.VehicleDto;
import ik.web.ijse.Entity.Customer;
import ik.web.ijse.Entity.Vehicle;
import ik.web.ijse.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/vehicle")

public class VehicleController {

    @Autowired
    private VehicleService vehicleService;
    @PostMapping("/add")
    private String AddVehicle(@RequestBody VehicleDto vehicleDto){

        return vehicleService.saveVehicle(vehicleDto) ;
    }

    @PutMapping("/update")
    public String updateVehicle(@RequestBody VehicleDto vehicleDto){
        return vehicleService.updateVehicle(vehicleDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVehicle(@PathVariable Integer id){
        vehicleService.deletevehicle(id);

    }
    @GetMapping(value = "/findById/{id}")
    public Vehicle searchVehicle(@PathVariable Integer id){
        return vehicleService.searchVehicle(id);

    }
    @GetMapping("/all")
    public List<VehicleDto> getAllVehicle(){

        return vehicleService.getAllVehicle();
    }

}
