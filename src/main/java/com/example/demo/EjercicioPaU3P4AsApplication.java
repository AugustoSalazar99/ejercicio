package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IProductoService;


@SpringBootApplication
public class EjercicioPaU3P4AsApplication implements CommandLineRunner {

	@Autowired
	private IProductoService productoService;
//	private static final Logger LOG = LoggerFactory.getLogger(EjercicioPaU3P4AsApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4AsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	Producto p=new Producto();
	p.setNombre("leche");
	p.setCodigoBarra("a23");
	p.setCategoria(null);
	p.setStock(null);
	p.setPrecio(null);
	
		this.productoService.guardar(p);
		
	}

}
