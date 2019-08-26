package com.facturacion.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facturacion.modelo.TipoProductoDao;

@Controller
public class TipoProductoControlador {
		
	@Autowired
	private TipoProductoDao tipoPrDao;

	@RequestMapping("/tipoproductos")
	public String listadeProductos(HttpServletRequest request) {
		request.setAttribute("tipoproductos", tipoPrDao.findAll());
		return "tipoproductos";
	}
}
