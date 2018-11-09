package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Produit;
import com.example.demo.servicers.IProduit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectDemoApplicationTests {
	@Autowired
	private IProduit iProduit;
	@Test
	public void contextLoads() {
		Produit prd=iProduit.getProduitById(3L);
        System.out.println("--helllll----"+prd.getQte());
	}
   
}
