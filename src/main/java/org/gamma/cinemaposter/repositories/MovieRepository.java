package org.gamma.cinemaposter.repositories;

import org.gamma.cinemaposter.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
