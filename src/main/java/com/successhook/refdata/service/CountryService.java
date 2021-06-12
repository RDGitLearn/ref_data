package com.successhook.refdata.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.successhook.refdata.dto.CountryDto;
import com.successhook.refdata.entity.Country;
import com.successhook.refdata.repository.CountryRepo;

@Service
public class CountryService {

	@Autowired
	CountryRepo countryRepo;
	
	public List<CountryDto> getCountries(Integer num3, String name) {
		List<Country> countries;
		if(StringUtils.isEmpty(name) && num3 == null) {
			countries = countryRepo.findAll();			
		}else {
			countries = countryRepo.findByNum3cdOrCountry(num3, name);
		}
		List<CountryDto> countryDtoList = new ArrayList<>();
		countries.stream().forEach(cntry -> {
		countryDtoList.add(	
			CountryDto.builder().num3cd(cntry.getNum3cd())
			.alpha2cd(cntry.getAlpha2cd())
			.alpha3cd(cntry.getAlpha3cd())
			.country(cntry.getCountry()).build());
		});
		
		return countryDtoList;
	}
	
	
}
