package com.example.demo.service;



import com.example.demo.repository.modelo.Producto;


public interface IProductoService  {
	
	public void guardar(Producto producto);
	public void actualizar(Producto producto);
	
	public Producto ingresarProducto(Producto producto);
	public Producto buscarCodigoBarras(String codigoBarra);

}
