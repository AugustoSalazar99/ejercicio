package com.example.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.dto.FacturaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepositoryImpl implements IFacturaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public FacturaDTO reporteFacturas(LocalDateTime fecha, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<FacturaDTO> myQuery=myBuilder.createQuery(FacturaDTO.class);
		
		/*8
		Root<FacturaDTO> miRoot = myQuery.from(FacturaDTO.class);
		Predicate condicion=myBuilder.equal(miRoot.get("",fecha);
		Predicate condicion1=myBuilder.equal(miRoot.get("",categoria);
		Predicate condicion2=myBuilder.equal(miRoot.get("", cantidad);
		myQuery.select(miRoot).where(condicion,condicion1,condicion2);
		TypedQuery<FacturaDTO> myQFinal=this.entityManager.createQuery(myQuery);
		
		return myQFinal.getSingleResult();
	*/
		return null;
	}
	
	
	

}
