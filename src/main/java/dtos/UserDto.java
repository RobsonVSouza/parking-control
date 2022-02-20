package dtos;


import com.api.parkingcontrol.models.ApartmentModel;
import com.api.parkingcontrol.models.CarModel;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private ApartmentModel apartmentModel;

    private CarModel carModel;


}
