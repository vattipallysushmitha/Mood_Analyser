/*
 * Purpose==>Given Null Mood Should Return Happy
 *          -To make this Test Case pass Handle NULL Scenario using try catch and return Happy
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
                return "HAPPY";
            
            else return null;
        } catch (Exception e)
        {
            return "HAPPY";

        }

    }
}
