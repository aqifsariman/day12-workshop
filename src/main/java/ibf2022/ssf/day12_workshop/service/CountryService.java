package ibf2022.ssf.day12_workshop.service;

import java.util.List;

import ibf2022.ssf.day12_workshop.model.Country;
import ibf2022.ssf.day12_workshop.repository.CountryRepo;

public class CountryService {
    CountryRepo countryRepo;

    public CountryService() {
        countryRepo = new CountryRepo();
    }

    public List<Country> getAllCountries() {
        return countryRepo.getAllCountries();
    }

    public Boolean createCountry(Country city) {
        return countryRepo.createCountry(city);
    }
}
