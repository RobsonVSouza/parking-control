package dtos;


import com.api.parkingcontrol.models.UserModel;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApartmentDto {

    private UUID id;

    @NotBlank
    private String number;

    @NotBlank
    private Integer floor;

    @NotBlank
    private String block;

    private UserModel userModel;
}
