package com.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articles_purchase" , catalog="db_web_store", schema="")
public class ArticlePurchaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer Articles_Purchase_ID;
	@Column
	private Integer Article_ID;
	@Column
	private Integer Purchase_Order_ID;
	
	public Integer getArticles_Purchase_ID() {
		return Articles_Purchase_ID;
	}
	public void setArticles_Purchase_ID(Integer articles_Purchase_ID) {
		Articles_Purchase_ID = articles_Purchase_ID;
	}
	public Integer getArticle_ID() {
		return Article_ID;
	}
	public void setArticle_ID(Integer article_ID) {
		Article_ID = article_ID;
	}
	public Integer getPurchase_Order_ID() {
		return Purchase_Order_ID;
	}
	public void setPurchase_Order_ID(Integer purchase_Order_ID) {
		Purchase_Order_ID = purchase_Order_ID;
	}
	
	
}
