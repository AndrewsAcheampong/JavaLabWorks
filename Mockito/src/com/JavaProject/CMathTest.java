package com.JavaProject;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CMathTest {

    @Test
   public void sumShouldReturnAValidResult(){
        CMath cMath = new CMath();
        int result = cMath.sum(1,4);
        int expectedResult = 5;

        assertEquals(expectedResult, result, "Sum did not work");
    }

    @Test
    public void sumShouldReturnAValidMOck(){
        CMath mockCMath = mock(CMath.class);
        when(mockCMath.sum(anyInt, anyInt())).thenReturn(5);

        int result = mockCMath.sum(4,6);
        assertEquals();
    }
}