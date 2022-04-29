package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import ar.edu.utn.link.correlativas.Alumno;

@Repository
public class RepoAlumno {

	private Collection<Alumno> alumno;

	public RepoAlumno() {
		alumno = new ArrayList<>();
	}
	
	public Alumno buscarXNombre(String nombreAlumno) {
		return alumno.stream().filter(x -> x.getNombre().equals(nombreAlumno)).findFirst().get();
	}

}
