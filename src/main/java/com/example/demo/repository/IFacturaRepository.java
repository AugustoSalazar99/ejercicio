package com.example.demo.repository;

import java.time.LocalDateTime;

import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.dto.FacturaDTO;

public interface IFacturaRepository {

	
	public FacturaDTO reporteFacturas(LocalDateTime fecha,String categoria,Integer cantidad);

}
