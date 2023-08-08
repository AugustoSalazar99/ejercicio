package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		if(this.productoRepository.buscarCodigoBarras(producto.getCodigoBarra())==null) {
			this.productoRepository.insertar(producto);
		}else {
			Producto producto1 = this.productoRepository.buscarCodigoBarras(producto.getCodigoBarra());
			Integer stock=producto1.getStock()+ producto.getStock();
			producto1.setStock(stock);
			this.productoRepository.actualizar(producto1);
		}
		this.productoRepository.insertar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.actualizar(producto);
	}

	@Override
	public Producto ingresarProducto(Producto producto) {
		// TODO Auto-generated method stub
		List<Producto> prodExistente=(List<Producto>) this.productoRepository.buscarCodigoBarras(producto.getCodigoBarra());
		if (!prodExistente.isEmpty()) {
			Producto producto1 =prodExistente.get(0);
			Integer nuevoStock =producto1.getStock()+producto.getStock();
			producto1.setStock(nuevoStock);
			this.productoRepository.actualizar(producto1);
			
		} else {
			this.productoRepository.insertar(producto);
			System.out.println("Registrado nuevo producto");

		}
		return producto;
	}

	@Override
	public Producto buscarCodigoBarras(String codigoBarra) {
		// TODO Auto-generated method stub
		return this.productoRepository.buscarCodigoBarras(codigoBarra);
	}
	
	

}
