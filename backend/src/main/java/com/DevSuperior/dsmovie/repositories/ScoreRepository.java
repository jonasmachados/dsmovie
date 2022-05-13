package com.DevSuperior.dsmovie.repositories;

import com.DevSuperior.dsmovie.entities.Score;
import com.DevSuperior.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {


}
