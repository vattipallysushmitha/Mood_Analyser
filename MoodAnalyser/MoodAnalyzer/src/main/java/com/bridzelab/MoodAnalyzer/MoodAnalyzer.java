/*
 * Purpose==>Given “I am in HAPPY Mood” message in Constructor Should Return HAPPY
            -To pass this Test Case when calling analyseMood method with no params should return HAPPY
 * @Author==>Sushmitha
 * @Since==>11-10-2022
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
        else if(message.contains("happy"))
            return "SAD";
        else return null;
    }
}



