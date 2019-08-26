package com.facturacion.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facturacion.modelo.ProductoDao;

@Controller
public class ProductosControlador {
		
	@Autowired
	private ProductoDao prDao;

	@RequestMapping("/productos")
	public String listadeProductos(HttpServletRequest request) {
		request.setAttribute("productos", prDao.findAll());
		return "productos";
	}
}
