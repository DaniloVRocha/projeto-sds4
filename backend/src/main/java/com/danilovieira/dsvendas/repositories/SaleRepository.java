package com.danilovieira.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilovieira.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
