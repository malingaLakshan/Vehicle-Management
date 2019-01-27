package ik.web.ijse.Service.ServiceImpl;

import ik.web.ijse.Dto.PaymentDto;
import ik.web.ijse.Dto.ReservationDto;
import ik.web.ijse.Dto.VehicleDto;
import ik.web.ijse.Entity.Customer;
import ik.web.ijse.Entity.Payment;
import ik.web.ijse.Entity.Recervation;
import ik.web.ijse.Entity.Vehicle;
import ik.web.ijse.Repositories.PaymentRepo;
import ik.web.ijse.Repositories.ReservationRepo;
import ik.web.ijse.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service

public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    @Autowired
    private PaymentRepo paymentRepo;

    private Payment payment;
    private Recervation reservation;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean saveReserve(ReservationDto reservationDto, PaymentDto paymentDto) {



        payment=new Payment(paymentDto.getpId(),paymentDto.getCost(),paymentDto.getDate(),new Customer(paymentDto.getCustomerId()),
                new Recervation(paymentDto.getReservationId()));
        paymentRepo.save(payment);

        reservation=new Recervation(reservationDto.getResId(),reservationDto.getrFrom(),reservationDto.getrTo(),
                reservationDto.getrDate(),new Payment(reservationDto.getPaymentId()),new Vehicle(reservationDto.getVehicleId()));
reservationRepo.save(reservation);

        return true;
    }

    @Override
    public List<VehicleDto> getNeedVehicle(String automission, String fuel_type, String vehicletype, int status) {

        List<VehicleDto>getNeedVehi=new ArrayList<>();
        List<Vehicle>vehicles=reservationRepo.getNeedVehicle(automission,fuel_type,vehicletype,status);

        for(Vehicle c:vehicles){
            getNeedVehi.add(new VehicleDto(c.getVehicleId(), c.getStatus(), c.getVehicletype(),
                    c.getFuelType(), c.getAutomission(),c.getDailyPrice(),c.getDisc()));

        }

        return getNeedVehi;




    }
    }



