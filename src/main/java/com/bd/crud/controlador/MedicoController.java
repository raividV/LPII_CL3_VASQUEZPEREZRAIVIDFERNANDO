package com.bd.crud.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.crud.modelo.ClassMedico;
import com.bd.crud.servicio.IMedico;

@Controller
@RequestMapping("/Raividi")
public class MedicoController {
	// ampolla xd
	@Autowired
	private IMedico imedico;

	@GetMapping("/listaMedico")
	public String ListadoMedico(Model model) {
		List<ClassMedico> listado = imedico.ListadoMedico();
		model.addAttribute("listado", listado);
		return "Raividi/ListaMedico";

	}////////////////////////////////////////////////////////// siuuuuu

	@GetMapping("/RegistroMedico")
	public String RegistrarMedico(Model model) {
		ClassMedico clmedico = new ClassMedico();
		model.addAttribute("regMedico", clmedico);
		return "Raividi/RegMedico";
	}////////////////////////////////////////////////// batallaaaaaa

	@PostMapping("/MensajeMedico")
	public String MensajeMedico(@ModelAttribute ClassMedico clmedico, Model model) {
		imedico.RegistrarMedico(clmedico);
		System.out.println("Datos registrados en BD");
		return "redirect:/Raividi/listaMedico";
	}

}/////////////////////////////////////////// BATALLA FINAL
