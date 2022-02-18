package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ApartmentModel;
import com.api.parkingcontrol.repositories.ApartmentRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {

    final ApartmentRepository apartmentRepository;


    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    @Transactional
    public ApartmentModel save(ApartmentModel apartmentModel){
        return apartmentRepository.save(apartmentModel);
    }

    public List<ApartmentModel> findAll(){
        return apartmentRepository.findAll();
    }
}
