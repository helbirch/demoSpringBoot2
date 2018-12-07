package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Produit;
import com.example.demo.servicers.IProduit;

@RestController("/")
@RequestMapping("/produits")
@CrossOrigin(origins = "http://localhost:4200")
public class ProduitController {
	
//	@RequestMapping(method=RequestMethod.GET)
//	public String helloWorld() {
//		return "helloooo";
//	}
	@Autowired
	private IProduit iProduit;
	@RequestMapping(method=RequestMethod.POST)
	public Produit addProduit(@RequestBody Produit p) {
		return iProduit.addProduit(p);
	}
	@RequestMapping(method=RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit p) {
		return iProduit.updateProduit(p);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Produit> allProduits() {
		return iProduit.allProduits();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Produit getProduitById(@PathVariable Long id) {
		return iProduit.getProduitById(id);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteProduit(@PathVariable Long id) {
		iProduit.deleteProduit(id);
	}
	@RequestMapping(value="/mc/{lib}",method=RequestMethod.GET)
	public List<Produit> getProduitByCode(@PathVariable String lib) {
		return iProduit.getProduitByMc(lib);
	}

}
