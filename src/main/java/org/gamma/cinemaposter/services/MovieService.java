package org.gamma.cinemaposter.services;

import lombok.RequiredArgsConstructor;
import org.gamma.cinemaposter.models.Movie;
import org.gamma.cinemaposter.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> listMovie() {
        return movieRepository.findAll();
    }
}
