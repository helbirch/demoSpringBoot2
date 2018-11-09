package com.example.demo.servicers;

import java.util.List;

import com.example.demo.entity.Produit;

public interface IProduit {
  public Produit addProduit(Produit p);
  public Produit updateProduit(Produit p);
  public List<Produit> allProduits();
  public Produit getProduitById(Long idProduit);
  public void deleteProduit(Long id);
  public List<Produit> getProduitByMc(String mc);
  
} 
