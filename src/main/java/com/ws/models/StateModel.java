package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="state" , catalog="db_web_store", schema="")
public class StateModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer State_ID;
	@Column
	private String Name;
	@Column
	private Integer Country_ID;
	
	public Integer getState_ID() {
		return State_ID;
	}
	public void setState_ID(Integer state_ID) {
		State_ID = state_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getCountry_ID() {
		return Country_ID;
	}
	public void setCountry_ID(Integer country_ID) {
		Country_ID = country_ID;
	}
	
}
