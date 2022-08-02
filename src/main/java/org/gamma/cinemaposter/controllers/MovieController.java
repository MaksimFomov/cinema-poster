package org.gamma.cinemaposter.controllers;

import lombok.RequiredArgsConstructor;
import org.gamma.cinemaposter.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("movies", movieService.listMovie());
        return "movies";
    }
}
