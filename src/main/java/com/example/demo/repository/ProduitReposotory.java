package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Produit;

public interface ProduitReposotory extends JpaRepository<Produit,Long> {
	@Query("Select p from Produit p where p.lib like %:lib%")
  public List<Produit> searshProduitByMc(@Param("lib")String lib);
}
