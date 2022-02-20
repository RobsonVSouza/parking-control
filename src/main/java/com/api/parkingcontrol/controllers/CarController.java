package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.services.CarService;
import dtos.CarDto;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("car")
public class CarController {

    final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCar (@RequestBody @Valid CarDto carDto){
        var carModel = new CarModel();
        BeanUtils.copyProperties(carDto, carModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(carModel));
    }

    @GetMapping
    public ResponseEntity<List<CarModel>> getAllCar(){
        return ResponseEntity.status(HttpStatus.OK).body(carService.findAll());
    }
}
