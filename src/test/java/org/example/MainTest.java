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

    @Test
    void returnFalse_whenPasswordContainLetters (){
        String password = "DasIstEinTest";
        boolean result = passwordValidation.passwordNumbers (password);
        assertFalse(result);
    }
    @Test
    void returnTrue_whenPasswordContainUpperCases (){
        String password = "DasIstEinTest";
        boolean result = passwordValidation.passwordUpperCase (password);
        assertTrue(result);
    }

    @Test
    void returnFalse_whenPasswordContainUpperCases (){
        String password = "dasisteintest";
        boolean result = passwordValidation.passwordUpperCase (password);
        assertFalse(result);
    }

    @Test
    void returnTrue_whenPasswordContainLowerCases (){
        String password = "DasIstEinTest";
        boolean result = passwordValidation.passwordLowerCase (password);
        assertTrue(result);
    }

    @Test
    void returnFalse_whenPasswordContainLowerCases (){
        String password = "DASISTEINTEST";
        boolean result = passwordValidation.passwordLowerCase (password);
        assertFalse(result);
    }

    @Test
    void returnTrue_whenPasswordIsCommon (){
        String password = "12345678";
        boolean result = passwordValidation.passwordCommon (password);
        assertTrue(result);
    }

    @Test
    void returnTrue_whenPasswordContainsSpecialCharacters (){
        String password = "DasIst#!";
        boolean result = passwordValidation.passwordSpecialChar (password);
        assertTrue(result);
    }

}