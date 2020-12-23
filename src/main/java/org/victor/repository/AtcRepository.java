package org.alexander.repository;

import org.alexander.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtcRepository extends JpaRepository<Country,Integer> {

}

