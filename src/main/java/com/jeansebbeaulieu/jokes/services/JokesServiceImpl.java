package com.jeansebbeaulieu.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    private final ChuckNorrisQuotes chuckNorrisQuotes;


    @Override
    public String getRandomQuote() {
       return chuckNorrisQuotes.getRandomQuote();

    }
}
