package com.detaysoft.bnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.detaysoft.bnet.entity.Us00;
import com.detaysoft.bnet.entity.id.Us00Id;

@Repository
public interface Us00Repository extends JpaRepository<Us00, Us00Id>{

	
}
