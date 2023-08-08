package com.example.demo.service;

import java.time.LocalDateTime;

import com.example.demo.repository.modelo.dto.FacturaDTO;

public interface IFacturaService {
	
	public FacturaDTO reporteFacturas(LocalDateTime fecha,String categoria,Integer cantidad);


}
