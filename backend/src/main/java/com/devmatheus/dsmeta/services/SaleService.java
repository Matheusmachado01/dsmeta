package com.devmatheus.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmatheus.dsmeta.entities.Sale;
import com.devmatheus.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	
	public List<Sale> findSales () {
		return repository.findAll();
		
	}
	
}
