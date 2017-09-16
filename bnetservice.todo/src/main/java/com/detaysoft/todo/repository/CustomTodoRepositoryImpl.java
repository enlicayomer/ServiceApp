//package com.detaysoft.todo.repository;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
//import javax.persistence.criteria.CriteriaQuery;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.data.jpa.repository.EntityGraph;
//import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
//import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
//import org.springframework.data.repository.NoRepositoryBean;
//
//@NoRepositoryBean
//public class CustomTodoRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements CustomTodoRepository<T, ID> {
//
//    private EntityManager em;
//
//    public CustomTodoRepositoryImpl(Class<T> domainClass, EntityManager em) {
//        super(domainClass, em);
//        this.em = em;
//    }
//
//    @Override
//    public List<T> findAll() {
//    	CriteriaQuery<T> query=em.createQuery(T.class);
////        TypedQuery<T> query = (TypedQuery<T>) em.createQuery("SELECT c FROM Pj03 c");
//        query.setHint(entityGraphType.getKey(), em.getEntityGraph(entityGraphName));
//        return query.getResultList();
//    }
////
////    @Override
////    public Page<T> findAll(Specification<T> spec, Pageable pageable, EntityGraph.EntityGraphType entityGraphType, String entityGraphName) {
////        TypedQuery<T> query = getQuery(spec, pageable.getSort());
////        query.setHint(entityGraphType.getKey(), em.getEntityGraph(entityGraphName));
////        return readPage(query, pageable, spec);
////    }
////
////    @Override
////    public List<T> findAll(Specification<T> spec, Sort sort, EntityGraph.EntityGraphType entityGraphType, String entityGraphName) {
////        TypedQuery<T> query = getQuery(spec, sort);
////        query.setHint(entityGraphType.getKey(), em.getEntityGraph(entityGraphName));
////        return query.getResultList();
////    }
////
////    @Override
////    public T findOne(Specification<T> spec, EntityGraph.EntityGraphType entityGraphType, String entityGraphName) {
////        TypedQuery<T> query = getQuery(spec, (Sort) null);
////        query.setHint(entityGraphType.getKey(), em.getEntityGraph(entityGraphName));
////        return query.getSingleResult();
////    }
//}