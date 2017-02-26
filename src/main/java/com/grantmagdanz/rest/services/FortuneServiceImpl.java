package com.grantmagdanz.rest.services;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by grantmagdanz on 2/26/17.
 */
@Component
public class FortuneServiceImpl implements FortuneService {

    private static final String[] FORTUNES = {"shit", "meh", "great!"};

    private Random r = new Random();

    @Override
    public String getFortune() {
        return FORTUNES[r.nextInt(FORTUNES.length)];
    }
}
