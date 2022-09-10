/*
 * Purpose==>Given “I am in Any Mood” message Should Return HAPPY
            -To make the Test case pass analyseMood method need to check for Sad else return HAPPY
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
