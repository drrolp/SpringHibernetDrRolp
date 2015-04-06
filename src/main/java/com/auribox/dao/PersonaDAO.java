package com.auribox.dao;

import java.util.List;

import com.auribox.model.Persona;

public interface PersonaDAO {
	
	public void save(Persona persona);
	public List<Persona> list();
	

}
