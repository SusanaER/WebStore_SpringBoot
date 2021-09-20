package com.ws.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase_orders" , catalog="db_web_store", schema="")
public class PurchaseOrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Purchase_Order_ID;
	@Column
	private Integer Client_ID; 
	@Column
	private Date Date;
	@Column
	private Integer Delivery_Packeges_ID;
	
	public Integer getPurchase_Order_ID() {
		return Purchase_Order_ID;
	}
	public void setPurchase_Order_ID(Integer purchase_Order_ID) {
		Purchase_Order_ID = purchase_Order_ID;
	}
	public Integer getClient_ID() {
		return Client_ID;
	}
	public void setClient_ID(Integer client_ID) {
		Client_ID = client_ID;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public Integer getDelivery_Packeges_ID() {
		return Delivery_Packeges_ID;
	}
	public void setDelivery_Packeges_ID(Integer delivery_Packeges_ID) {
		Delivery_Packeges_ID = delivery_Packeges_ID;
	}
	
}
