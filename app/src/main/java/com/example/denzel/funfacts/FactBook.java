package com.example.denzel.funfacts;
import java.util.Random;
/**
 * Created by denzel on 12/20/15.
 */
public class FactBook {

    public String getFact(){

        //Member variables
        String facts[] = {
                "Fact 1",
                "Fact 2",
                "Fact 3",
                "Fact 4",
                "Fact 5",
                "Fact 6",
                "Fact 7"
        };

        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        fact = facts[randomNumber];
        return fact;
    }
}
