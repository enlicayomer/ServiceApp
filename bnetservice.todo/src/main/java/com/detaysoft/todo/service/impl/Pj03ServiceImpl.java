//package com.detaysoft.todo.service.impl;
//
//import java.util.List;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Join;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.domain.*;
//import org.springframework.data.jpa.repository.EntityGraph;
//import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
//import org.springframework.stereotype.Service;
//
//import com.detaysoft.project.entity.Pj01;
//import com.detaysoft.todo.entity.Pj03;
//import com.detaysoft.todo.repository.CustomTodoRepository;
////import com.detaysoft.todo.repository.Pj03Repository;
//import com.detaysoft.todo.service.Pj03Service;
//
//@Service
//public class Pj03ServiceImpl implements Pj03Service {
//
////	private Pj03Repository pj03Repository;
//	
////	@Autowired
//	private CustomTodoRepository<Pj03, String> todoRepository;
//	
////	@Autowired
////	public Pj03ServiceImpl(Pj03Repository pj03Repository) {
////		this.pj03Repository=pj03Repository;
////	}
////	
//	@Override
//	public List<Pj03> findAll(Pageable pageable) {
//		
////		Page<Pj03> page=pj03Repository.findAll(pageable);
//		List<Pj03> page=todoRepository.findAll();
//		return page;
//	}
//
//    public static Specification<Pj03> nullSpec() {
//    	return new Specification<Pj03>() {
//		@Override
//		public Predicate toPredicate(Root<Pj03> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////			final Subquery<Long> personQuery = query.subquery(Long.class);
////            final Root<Users> user = personQuery.from(Users.class);
////            final Join<Pj03, Pj01> users = root.join("pj01");
////            final Join<Person, Project> project = root.join("projects");
////            personQuery.select(notes.<Long> get("id"));
////            query.where(cb.equal(root.<Long> get("name"), personId));
////            return cb.
////            return cb.in(root.get("id")).value(users).value(project);
//			
////			javax.persistence.EntityGraph<Pj03> entityGraph=root.
//			return cb.equal(root.get("clid"),"100");
//		}
//    	};
//    	}
//	
//    public static Specification<Pj03> getPersonUser(final Long personId) {
//    	return new Specification<Pj03>() {
//		@Override
//		public Predicate toPredicate(Root<Pj03> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
////			final Subquery<Long> personQuery = query.subquery(Long.class);
////            final Root<Users> user = personQuery.from(Users.class);
////            final Join<Users, Person> users = root.join("persons");
////            final Join<Person, Project> project = root.join("projects");
////            personQuery.select(notes.<Long> get("id"));
////            query.where(cb.equal(root.<Long> get("name"), personId));
////            return cb.
////            return cb.in(root.get("id")).value(users).value(project);
//			
////			javax.persistence.EntityGraph<Pj03> entityGraph=root.
//			return cb.in(root.get("id"));
//		}
//    	};
//    	}
//
//
//}
