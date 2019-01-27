package ik.web.ijse.Service;

import ik.web.ijse.Dto.PaymentDto;
import ik.web.ijse.Dto.ReservationDto;
import ik.web.ijse.Dto.VehicleDto;

import java.util.List;

public interface ReservationService {


    List<VehicleDto> getNeedVehicle(String automission, String fuel_type, String vehicletype, int status);

    boolean saveReserve(ReservationDto reservationDto, PaymentDto paymentDto);
}
