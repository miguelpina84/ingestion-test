package com.home.ingestiontest.repository;

import com.home.ingestiontest.model.dbModel.ZapatoM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZapatoRepository extends JpaRepository<ZapatoM, Long> {
}
