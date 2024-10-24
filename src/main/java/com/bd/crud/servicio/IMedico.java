package com.bd.crud.servicio;

import java.util.List;

import com.bd.crud.modelo.ClassMedico;

public interface IMedico {
	//DECLARACION
	public void RegistrarMedico(ClassMedico clmedico);
	public List<ClassMedico> ListadoMedico();

}////////////////////////////////////////////////////////////////////fin
