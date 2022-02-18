package dtos;

import com.api.parkingcontrol.models.ApartmentModel;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;

    private LocalDateTime registrationDate;

}
