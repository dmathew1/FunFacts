package com.example.denzel.funfacts;
import java.util.Random;
/**
 * Created by denzel on 12/20/15.
 */
public class FactBook {

    public String getFact(){

        //Member variables
        String facts[] = {
                "Nirmel picks his nose",
                "Jesus Christ is my nigga",
                "Fetty Wrap has a glauc in his 'rari",
                "Fetty Wrap can't read 1738 properly",
                "etc etc etc",
                "test test test",
                "Fetty Wrap has got this soda",
                "Lexus C300"
        };

        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        fact = facts[randomNumber];
        return fact;
    }
}
