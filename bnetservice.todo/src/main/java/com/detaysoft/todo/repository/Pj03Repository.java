package com.detaysoft.todo.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.detaysoft.todo.entity.Pj03;

public interface Pj03Repository extends JpaRepository<Pj03, String> {

//	@EntityGraph(value = "Pj03.pj01", type = EntityGraphType.LOAD)
	Page<Pj03> findAll(Pageable pageable);
//	@Modifying
	@Query(value = "SELECT top 20 CLID,TKID,TKTX,PJID FROM SAPSR3.[/ATOM/PJ03]", nativeQuery = true)
	List<Pj03> getPj03();
}
