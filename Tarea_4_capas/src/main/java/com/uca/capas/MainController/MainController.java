package com.uca.capas.MainController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.Producto.Producto;

@Controller
public class MainController {
	
	@GetMapping("/producto")
	public String enviarForm(Producto producto) {
		return "agregarProducto";
	}
	
	@PostMapping("/producto")
	public String procesarFrom(@Valid Producto producto, BindingResult result) {
		if(result.hasErrors()) {
			return "agregarProducto";
		}
		return "mostrarMensaje";
	}
	
}
