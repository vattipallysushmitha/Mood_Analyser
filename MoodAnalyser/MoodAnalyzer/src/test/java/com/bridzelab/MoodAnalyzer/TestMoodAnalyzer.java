package com.bridzelab.MoodAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class TestMoodAnalyzer
    {

    @Test
        public void whenMoodIsSad()
        {

            //TC 1.1 "I am in sad mood"
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.moodCheck("I am in sad mood");
            System.out.println(mood);
            Assertions.assertEquals(mood, "SAD");
        }
        @Test
        
        public void whenMoodIsHappy()
        {

            //TC 1.2 "I am in happy mood"
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
            String mood = moodAnalyzer.moodCheck("I am in happy mood");
            System.out.println(mood);
            Assertions.assertEquals(mood, "HAPPY");
        }
    }

