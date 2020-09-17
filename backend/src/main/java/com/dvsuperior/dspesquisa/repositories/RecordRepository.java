package com.dvsuperior.dspesquisa.repositories;

import com.dvsuperior.dspesquisa.entities.Game;
import com.dvsuperior.dspesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
