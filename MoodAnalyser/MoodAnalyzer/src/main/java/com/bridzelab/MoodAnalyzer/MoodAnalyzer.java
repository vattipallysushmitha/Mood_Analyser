/*
 * Purpose==>Handle Exception if User Provides Invalid Mood
            - Like NULL
 * @Author==>Sushmitha
 * @Since==>11-10-2022
 */

package com.bridzelab.MoodAnalyzer;

public class MoodAnalyzer {
    private String message;

    //Default Constructor
    public MoodAnalyzer() {
    }

    //Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        //Handle NULLPOINTER Exception using try-catch block
        try {
            if (message.contains("sad"))
                return "SAD";
            else if(message.contains("happy"))
                return "SAD";
            else return null;
        } catch (Exception e)
        {

        }
            return "HAPPY";

    }
}
