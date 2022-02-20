package dtos;

import com.api.parkingcontrol.models.ApartmentModel;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpotDto {

    private UUID id;

    @NotBlank
    private String parkingSpotNumber;

    private LocalDateTime registrationDate;

    private ApartmentModel apartmentModel;

}
