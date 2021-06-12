package com.successhook.refdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.successhook.refdata.dto.CountryDto;
import com.successhook.refdata.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService countryService;
	
	@GetMapping(value="/countries")
	public List<CountryDto> getCountries(@RequestParam(required = false) Integer num3, @RequestParam(required =false) String name) {
		System.out.println(String.format("countries controller... Num3 = %s n name = %s ", num3, name));
		return countryService.getCountries( num3,  name);
	}
	
//	@GetMapping(value="/country-code-name")
//	
//	public List<CountryDto> getCountriesByCodeAndName(@RequestParam(required = false) Integer num3, @RequestParam(required =false) String name){
//		System.out.println("Country By Code and Name");
//		return countryService.getCountries();
//	}
}
 