package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country" , catalog="db_web_store", schema="")
public class CountryModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Country_ID;
	@Column
	private String Name;
	
	public Integer getCountry_ID() {
		return Country_ID;
	}
	public void setCountry_ID(Integer country_ID) {
		Country_ID = country_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
