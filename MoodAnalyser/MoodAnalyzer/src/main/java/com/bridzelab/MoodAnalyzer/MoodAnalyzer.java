/*
 * Purpose==>Given a Message, abilit to analyse and respond Happy or Sad Mood
 *         - Create MoodAnalyser Object - Call analyseMood function with message as parameter and return Happy or Sad Mood
 * @Author==>Sushmitha
 * @Since==>09-10-2022
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
    public static void main(String args[])
    {
        System.out.println("********************************");
        System.out.println("Welcome to MoodAnalyzer Program");
        System.out.println("********************************");

        MoodAnalyzer mood = new MoodAnalyzer();
        System.out.println(mood.moodCheck("i am in happy mood"));
    }


}
