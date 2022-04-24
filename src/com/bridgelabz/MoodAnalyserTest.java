package com.bridgelabz;
import static org.junit.Assert.assertEquals;

import org.junit.*;
public class MoodAnalyserTest {
	 MoodAnalyser mood = new MoodAnalyser(null);

	    @Test
	    public void givenMessage_WhenProper_ShouldReturnSad(){
	        String actual = mood.analyseMood();
	        assertEquals("",actual);
	    }
}

