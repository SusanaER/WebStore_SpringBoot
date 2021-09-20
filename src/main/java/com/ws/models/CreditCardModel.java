package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_cards" , catalog="db_web_store", schema="")
public class CreditCardModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Credit_Card_ID;
	@Column
	private Integer Number;
	@Column
	private String Cardholder;
	@Column
	private Integer Type_CC_ID;
	
	public Integer getCredit_Card_ID() {
		return Credit_Card_ID;
	}
	public void setCredit_Card_ID(Integer credit_Card_ID) {
		Credit_Card_ID = credit_Card_ID;
	}
	public Integer getNumber() {
		return Number;
	}
	public void setNumber(Integer number) {
		Number = number;
	}
	public String getCardholder() {
		return Cardholder;
	}
	public void setCardholder(String cardholder) {
		Cardholder = cardholder;
	}
	public Integer getType_CC_ID() {
		return Type_CC_ID;
	}
	public void setType_CC_ID(Integer type_CC_ID) {
		Type_CC_ID = type_CC_ID;
	}
}
