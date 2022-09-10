/*
 * Purpose==>Given “I am in Any Mood” message Should Return HAPPY
            -To make the Test case pass analyseMood method need to check for Sad else return HAPPY
 * @Author==>Sushmitha
 * @Since==>10-10-2022
 */
package com.bridzelab.MoodAnalyzer;

public class MoodAnalyzer
{
    private String message;

    //Default Constructor
    public MoodAnalyzer()
    {
    }

    //Parameterized Constructor
    public MoodAnalyzer(String message)
    {
        this.message = message;
    }

    public String analyseMood()
    {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}



