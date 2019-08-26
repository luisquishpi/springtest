package com.facturacion.modelo.servicio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturacion.modelo.Producto;
import com.facturacion.modelo.ProductoDao;

@Service
@Transactional
public class ProductoServicio {
	
	@Autowired
	private ProductoDao productoDao;

	public List<Producto> ListaTodo(){
		return (List<Producto>) productoDao.findAll();
	}
}
