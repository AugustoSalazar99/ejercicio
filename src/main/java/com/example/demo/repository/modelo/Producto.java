package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
@NamedNativeQuery(name = "Producto.BuscarCodigoBarras", query = 
"select * from producto p where p.producto_codigoBarra=:datoCodigo", resultClass = Producto.class)
public class Producto {
	
	@GeneratedValue(generator = "seq_producto", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto", allocationSize = 1)
	
	@Id
	@Column(name="prod_")
	private Integer id;
	@Column(name="prod_codigoBarra")
	private String codigoBarra;
	@Column(name="prod_nombre")
	private String nombre;
	@Column(name="prod_categoria")
	private String categoria;
	@Column(name="prod_stock")
	private Integer stock;
	@Column(name="prod_precio")
	private BigDecimal precio;
	

	  //relacion
	  
	  @ManyToOne
	  @JoinColumn(name = "producto_id_detalle") 
	  private DetalleFactura detalle;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCodigoBarra() {
		return codigoBarra;
	}


	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public DetalleFactura getDetalle() {
		return detalle;
	}


	public void setDetalle(DetalleFactura detalle) {
		this.detalle = detalle;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigoBarra=" + codigoBarra + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", stock=" + stock + ", precio=" + precio + ", detalle=" + detalle + "]";
	}
	  
	  
	  
	 
}
