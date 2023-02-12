package com.asapyuca.fleetapp.services;

import com.asapyuca.fleetapp.models.Country;
import com.asapyuca.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

}
