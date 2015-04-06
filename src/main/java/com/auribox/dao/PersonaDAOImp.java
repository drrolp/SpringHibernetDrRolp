package com.auribox.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.auribox.model.Persona;

public class PersonaDAOImp implements PersonaDAO {
	private SessionFactory sessionFactory;
	
	// seteamos la fabrica de sessiones
	public void setSeccionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public PersonaDAOImp() {
		// TODO Auto-generated constructor stub
	}

	// implementacion para guardar personas
	@Override
	public void save(Persona persona) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(persona);
		transaction.commit();
		session.close();

	}

	// implementacion para listar personas
	@Override
	public List<Persona> list() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Persona> listaPersonas = session.createQuery("from Person").list();
		session.close();
		return null;
	}

}
