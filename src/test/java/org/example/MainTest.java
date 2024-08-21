package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidationTest {
    @Test
    void returnTrue_whenPasswordLengthMin8 (){
        String password = "12345678";
        boolean result = passwordValidation.passwordLength(password);
        assertTrue(result);
    }
    @Test
    void returnFalse_whenPasswordLengthMax7 (){
        String password = "1234567";
        boolean result = passwordValidation.passwordLength(password);
        assertFalse(result);
    }

    @Test
    void returnTrue_whenPasswordContainNumbers (){
        String password = "12345678";
        boolean result = passwordValidation.passwordNumbers (password);
        assertTrue(result);
    }
}