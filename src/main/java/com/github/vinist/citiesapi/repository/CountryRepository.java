package com.github.vinist.citiesapi.repository;

import com.github.vinist.citiesapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
