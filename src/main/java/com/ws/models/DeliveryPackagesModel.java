package com.ws.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="delivery_packeges" , catalog="db_web_store", schema="")
public class DeliveryPackagesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Delivery_Packeges_ID;
	@Column
	private Date Delivery_Date;
	@Column
	private Integer Packege_Number;
	@Column
	private Integer Delivery_Company_ID;
	
	public Integer getDelivery_Packeges_ID() {
		return Delivery_Packeges_ID;
	}
	public void setDelivery_Packeges_ID(Integer delivery_Packeges_ID) {
		Delivery_Packeges_ID = delivery_Packeges_ID;
	}
	public Date getDelivery_Date() {
		return Delivery_Date;
	}
	public void setDelivery_Date(Date delivery_Date) {
		Delivery_Date = delivery_Date;
	}
	public Integer getPackege_Number() {
		return Packege_Number;
	}
	public void setPackege_Number(Integer packege_Number) {
		Packege_Number = packege_Number;
	}
	public Integer getDelivery_Company_ID() {
		return Delivery_Company_ID;
	}
	public void setDelivery_Company_ID(Integer delivery_Company_ID) {
		Delivery_Company_ID = delivery_Company_ID;
	}
	
}
