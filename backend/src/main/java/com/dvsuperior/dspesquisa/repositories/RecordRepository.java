package com.dvsuperior.dspesquisa.repositories;

import com.dvsuperior.dspesquisa.entities.Game;
import com.dvsuperior.dspesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
