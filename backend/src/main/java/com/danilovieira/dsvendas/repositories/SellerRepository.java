package com.danilovieira.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilovieira.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
