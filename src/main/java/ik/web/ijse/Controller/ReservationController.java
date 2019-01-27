package ik.web.ijse.Controller;

import ik.web.ijse.Dto.PaymentDto;
import ik.web.ijse.Dto.ReservationDto;
import ik.web.ijse.Dto.VehicleDto;
import ik.web.ijse.Service.PaymentService;
import ik.web.ijse.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reservation")

public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/getNeed/{automission}/{fuel_type}/{vehicletype}/{status}")
    public List<VehicleDto> getNeedVehicles(@PathVariable String automission,@PathVariable String fuel_type,@PathVariable String vehicletype,@PathVariable int status){
        return reservationService.getNeedVehicle(automission,fuel_type,vehicletype,status);
    }

    @PostMapping("/add")
    public boolean addReservation(@RequestBody ReservationDto reservationDto, PaymentDto paymentDto) {

        return reservationService.saveReserve(reservationDto,paymentDto);
    }


}
