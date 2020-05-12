package com.demo;

import java.util.ArrayList;
import java.util.List;

public class PersonaServicioImpl implements IPersonaServicio {

	@Override
	public Persona buscarId(int id) {
		// TODO Auto-generated method stub
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona(1, "Ronald", "donayre"));
		lista.add(new Persona(2, "Juan", "arce"));
		lista.add(new Persona(3, "Maria", "vargas"));
		
		Persona persona = null;
		
		for(Persona per: lista) {
			if(per.getIdpersona() == id) {
				persona = per;
			}
		}
		
		return persona;
	}
	
}
