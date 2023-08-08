package com.example.demo.repository.modelo.dto;

import java.time.LocalDateTime;

public class FacturaDTO {
	
	private LocalDateTime fecha;
	private String categoria;
	private Integer cantidad;
	
	
	public FacturaDTO() {
		
		// TODO Auto-generated constructor stub
	}


	public FacturaDTO(LocalDateTime fecha, String categoria, Integer cantidad) {
		super();
		this.fecha = fecha;
		this.categoria = categoria;
		this.cantidad = cantidad;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "FacturaDTO [fecha=" + fecha + ", categoria=" + categoria + ", cantidad=" + cantidad + "]";
	}
	
	
	
	

}
