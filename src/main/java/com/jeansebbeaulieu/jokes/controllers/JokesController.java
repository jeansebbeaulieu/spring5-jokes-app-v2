package com.jeansebbeaulieu.jokes.controllers;

import com.jeansebbeaulieu.jokes.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    public JokesService getJokesService() {
        return jokesService;
    }

    @Autowired
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", "" })
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getRandomQuote());
        return "jokes/index";
    }
}
