package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="delivery_company" , catalog="db_web_store", schema="")
public class DeliveryCompanyModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Delivery_Company_ID;
	@Column 
	private String Name;
	
	public Integer getDelivery_Company_ID() {
		return Delivery_Company_ID;
	}
	public void setDelivery_Company_ID(Integer delivery_Company_ID) {
		Delivery_Company_ID = delivery_Company_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
