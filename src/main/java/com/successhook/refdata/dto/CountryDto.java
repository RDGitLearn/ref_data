package com.successhook.refdata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CountryDto {
	
	int num3cd;
	String alpha2cd;
	String alpha3cd;
	String country;

}
