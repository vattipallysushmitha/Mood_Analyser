package com.bridzelab.MoodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMoodAnalyzer
{


    @Test
    public void whenMoodIsSad()
    {
        //Tc1.1 Refactor
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
        String mood = moodAnalyzer.analyseMood();
        System.out.println(mood);
        Assertions.assertEquals(mood,"SAD");
    }

   @Test
    public void whenMoodIsHappy()
   {
        //Tc1.2 Refactor
       MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
       String mood1 = moodAnalyzer.analyseMood();
       System.out.println(mood1);
       Assertions.assertEquals(mood1,"SAD");

    }
    @Test
    public void whenMoodIsNull()
    { //tc 2.1
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood2 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood2,"NULL");

    }
}

