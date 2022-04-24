package com.bridgelabz;

public class MoodAnalyser {
	static String message;

    public MoodAnalyser(String message) {
        MoodAnalyser.message = message;
    }

    public static String analyseMood() {
        String messageOne = "I am in Sad Mood";
        String messageTwo = "I am in any Mood";

        try {
            if (message.equalsIgnoreCase(messageOne))
                return "SAD";
            else if (message.equalsIgnoreCase(messageTwo))
                return "HAPPY";
            else if (message.isEmpty() || message == null)
                throw new MoodAnalysisException("Invalid Mood");
            else
                return "No Match";

        } catch (MoodAnalysisException e) {
            e.printStackTrace();
            return "Invalid Mood";
        }

    }
}
