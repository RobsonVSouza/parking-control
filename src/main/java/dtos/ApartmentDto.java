package dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApartmentDto {

    @NotBlank
    private String number;

    private Integer floor;

    @NotBlank
    private String block;

}
