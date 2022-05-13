package com.DevSuperior.dsmovie.repositories;

import com.DevSuperior.dsmovie.*;
import com.DevSuperior.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
