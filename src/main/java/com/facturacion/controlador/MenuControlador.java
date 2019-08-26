package com.facturacion.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuControlador {

	@RequestMapping("/")
	public String menu() {
		return "menu";
	}
}
