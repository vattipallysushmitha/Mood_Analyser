/*
 * Purpose==>Given “I am in Sad Mood” message in Constructor Should Return SAD
            -To pass this Test Case when calling analyseMood method with no params should return SAD
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
        else
            return "HAPPY";
    }
}



