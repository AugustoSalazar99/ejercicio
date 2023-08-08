package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.dto.FacturaDTO;

import jakarta.persistence.criteria.CriteriaBuilder;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Override
	public FacturaDTO reporteFacturas(LocalDateTime fecha, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
		
	
		
		
		return null;
	}

	
}
