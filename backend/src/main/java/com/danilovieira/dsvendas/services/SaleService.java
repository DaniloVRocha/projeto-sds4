package com.danilovieira.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danilovieira.dsvendas.dto.SaleDTO;
import com.danilovieira.dsvendas.dto.SaleSuccessDTO;
import com.danilovieira.dsvendas.dto.SaleSumDTO;
import com.danilovieira.dsvendas.entities.Sale;
import com.danilovieira.dsvendas.repositories.SaleRepository;
import com.danilovieira.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> sale = saleRepository.findAll(pageable);
		return sale.map(x -> new SaleDTO(x));
	}

	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return saleRepository.amountGroupedBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return saleRepository.successGroupedBySeller();
	}
}
