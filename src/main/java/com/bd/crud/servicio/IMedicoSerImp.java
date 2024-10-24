package com.bd.crud.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.crud.modelo.ClassMedico;
import com.bd.crud.repositorio.IMedicoRepository;

@Service
public class IMedicoSerImp implements IMedico{
	
	//aplicamos la inyeccion
	@Autowired
	private IMedicoRepository imedicorepos;

	@Override
	public void RegistrarMedico(ClassMedico clmedico) {
		// invacacion de pokemon Registreishon
		imedicorepos.save(clmedico);
		
	}///////////////////////////////////////////////////////////fin batalla

	@Override
	public List<ClassMedico> ListadoMedico() {
		// INVOCAMOS al Sasuke Listar
		return (List<ClassMedico>) imedicorepos.findAll();
	}//////////////////////////////////////////////////////////fin batalla








}/////////////////////////////fin imp

