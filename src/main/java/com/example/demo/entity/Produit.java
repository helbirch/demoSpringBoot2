package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produit {
	@Id @GeneratedValue
  private Long idProduit;
  private String lib;
  private float qte;
  private float prix;
public Produit() {
	super();
}
public Produit(Long idProduit, String lib, float qte, float prix) {
	super();
	this.lib = lib;
	this.qte = qte;
	this.prix = prix;
}
public Long getIdProduit() {
	return idProduit;
}
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}
public String getLib() {
	return lib;
}
public void setLib(String lib) {
	this.lib = lib;
}
public float getQte() {
	return qte;
}
public void setQte(float qte) {
	this.qte = qte;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
  
}
