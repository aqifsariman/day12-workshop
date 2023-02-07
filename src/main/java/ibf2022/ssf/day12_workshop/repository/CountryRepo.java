package ibf2022.ssf.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ibf2022.ssf.day12_workshop.model.Country;

@Repository
public class CountryRepo {

    List<Country> countryList;

    public List<Country> getAllCountries() {
        countryList = new ArrayList<Country>();
        Country city = new Country("SG", "Singapore", 6000000);
        countryList.add(city);
        city = new Country("MY", "Malaysia", 33000000);
        countryList.add(city);
        city = new Country("CN", "China", 143000000);
        countryList.add(city);
        city = new Country("TH", "Thailand", 35000000);
        countryList.add(city);

        return countryList;
    }

    public Boolean createCountry(Country city) {
        if (countryList == null) {
            countryList = new ArrayList<Country>();
        }
        countryList.add(city);
        return true;
    }
}
