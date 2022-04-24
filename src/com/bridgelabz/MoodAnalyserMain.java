package com.bridgelabz;

public class MoodAnalyserMain {
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
        MoodAnalyser mood = new MoodAnalyser("");
        System.out.println(mood.analyseMood());
    }
}  