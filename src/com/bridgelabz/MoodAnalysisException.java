package com.bridgelabz;

public class MoodAnalysisException extends Exception {
    String msg;

    public MoodAnalysisException(String msg) {
        this.msg = msg;
    }
}