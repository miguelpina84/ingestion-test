package com.home.ingestiontest.repository;

import com.home.ingestiontest.model.dbModel.VehiculoM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<VehiculoM, Long> {
}
