package com.mycompany.springapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mycompany.springapp.model.Address;
import com.mycompany.springapp.model.Person;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AddressDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Address find(Long id) {
		return entityManager.find(Address.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> getPeople() {
		return entityManager.createQuery("select a from Address a").getResultList();
	}
	
	@Transactional
	public Address save(Address addr) {
		if (addr.getId() == null) {
			entityManager.persist(addr);
			return addr;
		} else {
			return entityManager.merge(addr);
		}		
	}	
	
}
