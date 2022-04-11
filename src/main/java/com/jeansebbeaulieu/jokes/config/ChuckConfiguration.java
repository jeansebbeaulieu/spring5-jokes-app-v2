package com.jeansebbeaulieu.jokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration -XmlConfiguration Test
public class ChuckConfiguration {

    //@Bean  -XmlConfiguration Test
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
