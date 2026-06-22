package com.home.ingestiontest.repository;

import com.home.ingestiontest.model.dbModel.ClienteM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteM, Integer> {
}
