package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="detallefactura")
public class DetalleFactura {
	@GeneratedValue(generator = "seq_detallefactura", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_detallefactura", sequenceName = "seq_detallefactura", allocationSize = 1)
	
	
	@Id
	@Column(name="det_id")
	private Integer id;
	@Column(name="det_cantidad")
	private Integer cantidad;
	@Column(name="det_precioUnitario")
	private BigDecimal precioUnitario;
	@Column(name="det_subTotal")
	private BigDecimal subTotal;
	@Column(name="det_idFactura")
	private Integer idFactura;
	@Column(name="det_idProducto")
	private Integer idProducto;
	
	
	//relacion
	@OneToMany(mappedBy = "detalle")
	private List<Producto> productos;
	
	@ManyToOne
	@JoinColumn(name = "deta_id_factura")
	private Factura factura;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subTotal=" + subTotal + ", idFactura=" + idFactura + ", idProducto=" + idProducto + ", productos="
				+ productos + ", factura=" + factura + "]";
	}
	
	
	
	 
	 
	
	
	 
	

	
	
	

}
