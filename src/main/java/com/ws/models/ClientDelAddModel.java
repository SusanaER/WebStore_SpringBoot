package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_del_add" , catalog="db_web_store", schema="")
public class ClientDelAddModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Client_Del_Add_ID;
	@Column
	private Integer Client_ID;
	@Column
	private Integer Del_Add_ID;
	
	public Integer getClient_Del_Add_ID() {
		return Client_Del_Add_ID;
	}
	public void setClient_Del_Add_ID(Integer client_Del_Add_ID) {
		Client_Del_Add_ID = client_Del_Add_ID;
	}
	public Integer getClient_ID() {
		return Client_ID;
	}
	public void setClient_ID(Integer client_ID) {
		Client_ID = client_ID;
	}
	public Integer getDel_Add_ID() {
		return Del_Add_ID;
	}
	public void setDel_Add_ID(Integer del_Add_ID) {
		Del_Add_ID = del_Add_ID;
	}
}
