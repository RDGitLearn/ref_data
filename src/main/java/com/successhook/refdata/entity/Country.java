package com.successhook.refdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int num3cd;
	String alpha2cd;
	String alpha3cd;
	String country;
}
