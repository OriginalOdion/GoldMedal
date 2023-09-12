package com.codecademy.goldmedal.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.GoldMedal;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long>{

    List<GoldMedal> findByCountryOrderByYearAsc();
    List<GoldMedal> findByCountryOrderByYearDesc();

    List<GoldMedal> findByCountryOrderBySeasonAsc();
    List<GoldMedal> findByCountryOrderBySeasonDesc();

    List<GoldMedal> findByCountryOrderByCityAsc();
    List<GoldMedal> findByCountryOrderByCityDesc();

    List<GoldMedal> findByCountryOrderByNameAsc();
    List<GoldMedal> findByCountryOrderByNameDesc();
    
    List<GoldMedal> findByCountryOrderByEventAsc();
    List<GoldMedal> findByCountryOrderByEventDesc();

    List<GoldMedal> findByCountry(String name);

    List<GoldMedal> findByCountryAndBySeasonOrderByYearAsc(String country, String season);
    List<GoldMedal> findBySeason(String season);
    List<GoldMedal> findByCountryAndBySeason(String country, String season);
    List<GoldMedal> findByCountryAndByGender(String country, String gender);
    

    
}
