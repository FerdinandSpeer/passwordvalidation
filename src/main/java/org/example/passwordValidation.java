package org.example;

public class passwordValidation {
    public static void main(String[] args) {

    }
    //Eine Methode um ein Passwort zu validieren, das mindestens 8 Zeichen lang ist
    public static boolean passwordLength(String password) {
        return password.length() >= 8;
    }

}