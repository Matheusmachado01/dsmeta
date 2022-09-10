package com.devmatheus.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmatheus.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
