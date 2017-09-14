package com.detaysoft.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.detaysoft.core.entity.Bp00;
import com.detaysoft.core.entity.Us00;

public interface Us00Repository extends JpaRepository<Us00, String> {
	Us00 findByUsid(String usid);
}
