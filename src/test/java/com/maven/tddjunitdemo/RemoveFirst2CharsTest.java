package com.maven.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirst2CharsTest {

	/* To do list
	 * 
	 * 1. Start A  : ABCD > BCD
	 * 2. Start 2 A : AACD > CD
	 * 3. 2nd char A : BACD -> BCD
	 * 4. 1st 2 not A : BBAA > BBAA
	 * 5. empty char : "" > "" 
	 * 6. Start and end 2 A : AABAA = BAA
	 * 
	 */
	
	RemoveFirst2Chars removeFirst2Chars;
	String result;
	@BeforeEach
	void init() {
		removeFirst2Chars = new RemoveFirst2Chars();
	}
	
	@Test
	void testStart2A() {	 
		
		assertEquals("CD",removeFirst2Chars.remove("AACD"));
	}
	

	@Test
	void testSecondA() {	 
		
		assertEquals("BCD",removeFirst2Chars.remove("BACD"));
	}
	

	@Test
	void testStartNotA() {	 
		
		assertEquals("BBAA",removeFirst2Chars.remove("BBAA"));
	}
	

	@Test
	void testEmpty() {	 
		
		assertEquals("",removeFirst2Chars.remove(""));
	}
	

	@Test
	void testStartAAEndAA() {	 
		
		assertEquals("BBAA",removeFirst2Chars.remove("AABBAA"));
	}
	
}
