package com.successhook.refdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currency {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int num3cd;
	String code;
	String currency;
	String symbol;
}
