package org.gamma.cinemaposter.controllers;

import lombok.RequiredArgsConstructor;
import org.gamma.cinemaposter.models.Movie;
import org.gamma.cinemaposter.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("movies", movieService.listMovie());
        return "movies";
    }

    @GetMapping("/movie/{id}")
    public String productInfo(@PathVariable Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "movie-info";
    }
}
