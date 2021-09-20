package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city" , catalog="db_web_store", schema="")
public class CityModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer City_ID;
	@Column
	private String Name;
	@Column
	private Integer State_ID;
	
	public Integer getCity_ID() {
		return City_ID;
	}
	public void setCity_ID(Integer city_ID) {
		City_ID = city_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getState_ID() {
		return State_ID;
	}
	public void setState_ID(Integer state_ID) {
		State_ID = state_ID;
	}
	
	
}
