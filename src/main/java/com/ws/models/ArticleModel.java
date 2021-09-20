package com.ws.models;

import javax.persistence.*;

@Entity
@Table(name="articles" , catalog="db_web_store", schema="")
public class ArticleModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer articlesId;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private double price;
	
	public Integer getArticlesId() {
		return articlesId;
	}
	public void setArticlesId(Integer articlesId) {
		this.articlesId = articlesId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	

}

