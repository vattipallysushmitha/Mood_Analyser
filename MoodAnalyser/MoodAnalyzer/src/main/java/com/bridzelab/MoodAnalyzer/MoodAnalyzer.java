/*
 * Purpose==>Given “I am in Sad Mood” message Should Return SAD
            -analyseMood method can just return
            -SAD to pass this Test Case (TC)
 * @Author==>Sushmitha
 * @Since==>10-10-2022
 */
package com.bridzelab.MoodAnalyzer;

public class MoodAnalyzer
{
    public String moodCheck(String message)
    {
        if (message.contains("sad"))
            return "SAD";
        else if (message.contains("happy"))
            return "HAPPY";
        else
            return null;
    }


}
