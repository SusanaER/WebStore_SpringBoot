package com.ws.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billing" , catalog="db_web_store", schema="")
public class BillingModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Billing_ID;
	@Column
	private double Amount;
	@Column
	private Date Date;
	@Column
	private Integer Purchase_Order_ID;
	
	public Integer getBilling_ID() {
		return Billing_ID;
	}
	public void setBilling_ID(Integer billing_ID) {
		Billing_ID = billing_ID;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public Integer getPurchase_Order_ID() {
		return Purchase_Order_ID;
	}
	public void setPurchase_Order_ID(Integer purchase_Order_ID) {
		Purchase_Order_ID = purchase_Order_ID;
	}

}
