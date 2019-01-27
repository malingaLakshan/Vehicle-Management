package ik.web.ijse.Repositories;

import ik.web.ijse.Dto.VehicleDto;
import ik.web.ijse.Entity.Recervation;
import ik.web.ijse.Entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepo extends JpaRepository<Recervation,Long>{






    @Query("SELECT v FROM Vehicle v WHERE LOWER(v.automission) = LOWER(:automission) and LOWER(v.fuelType)=lower(:fuelType) " +
            "and LOWER(v.vehicletype)=lower(:vehicletype) and LOWER(v.status)=lower(:status) ")
    public List<Vehicle> getNeedVehicle(@Param("automission") String automission,@Param("fuelType") String fuelType,
                                        @Param("vehicletype") String vehicletype,@Param("status") int status);
}
