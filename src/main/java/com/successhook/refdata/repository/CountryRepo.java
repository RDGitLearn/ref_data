package com.successhook.refdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.successhook.refdata.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {

	 public List<Country> findAll();
	 public List<Country> findByNum3cdAndCountry(Integer num, String name);
}
