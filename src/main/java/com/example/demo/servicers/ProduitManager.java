package com.example.demo.servicers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitReposotory;

@Service
public class ProduitManager implements IProduit {
	@Autowired
   private ProduitReposotory produitReposotory;

	@Override
	public Produit addProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitReposotory.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitReposotory.save(p);
	}

	@Override
	public List<Produit> allProduits() {
		// TODO Auto-generated method stub
		return produitReposotory.findAll();
	}

	@Override
	public Produit getProduitById(Long idProduit) {
		  
		// TODO Auto-generated method stub
		return produitReposotory.getOne(idProduit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		produitReposotory.deleteById(id);
	}

	@Override
	public List<Produit> getProduitByMc(String mc){
		// TODO Auto-generated method stub
		return (List<Produit>) produitReposotory.searshProduitByMc(mc);
	}
	
}
