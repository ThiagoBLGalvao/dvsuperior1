package com.dvsuperior.dspesquisa.repositories;

import com.dvsuperior.dspesquisa.entities.Game;
import com.dvsuperior.dspesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
