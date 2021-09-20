package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="delivery_address" , catalog="db_web_store", schema="")
public class DeliveryAddressModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Del_Add_ID;
	@Column
	private String Street;
	@Column
	private Integer Number;
	@Column
	private Integer City_ID;
	@Column
	private Integer State_ID;
	@Column
	private Integer Country_ID;
	
	public Integer getDel_Add_ID() {
		return Del_Add_ID;
	}
	public void setDel_Add_ID(Integer del_Add_ID) {
		Del_Add_ID = del_Add_ID;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public Integer getNumber() {
		return Number;
	}
	public void setNumber(Integer number) {
		Number = number;
	}
	public Integer getCity_ID() {
		return City_ID;
	}
	public void setCity_ID(Integer city_ID) {
		City_ID = city_ID;
	}
	public Integer getState_ID() {
		return State_ID;
	}
	public void setState_ID(Integer state_ID) {
		State_ID = state_ID;
	}
	public Integer getCountry_ID() {
		return Country_ID;
	}
	public void setCountry_ID(Integer country_ID) {
		Country_ID = country_ID;
	}
	
}
