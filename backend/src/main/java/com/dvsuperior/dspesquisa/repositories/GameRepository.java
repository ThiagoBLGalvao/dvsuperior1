package com.dvsuperior.dspesquisa.repositories;

import com.dvsuperior.dspesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
