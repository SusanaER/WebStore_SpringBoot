package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_credit_card" , catalog="db_web_store", schema="")
public class ClientCreditCardModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Client_Credit_Card_ID;
	@Column
	private Integer Client_ID;
	@Column
	private Integer Credit_Card_ID;
	
	public Integer getClient_Credit_Card_ID() {
		return Client_Credit_Card_ID;
	}
	public void setClient_Credit_Card_ID(Integer client_Credit_Card_ID) {
		Client_Credit_Card_ID = client_Credit_Card_ID;
	}
	public Integer getClient_ID() {
		return Client_ID;
	}
	public void setClient_ID(Integer client_ID) {
		Client_ID = client_ID;
	}
	public Integer getCredit_Card_ID() {
		return Credit_Card_ID;
	}
	public void setCredit_Card_ID(Integer credit_Card_ID) {
		Credit_Card_ID = credit_Card_ID;
	}
	
	
}
