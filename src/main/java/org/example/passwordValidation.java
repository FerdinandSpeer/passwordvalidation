package org.example;

public class passwordValidation {
    public static void main(String[] args) {

    }

    //Eine Methode um ein Passwort zu validieren, das mindestens 8 Zeichen lang ist
    public static boolean passwordLength(String password) {
        return password.length() >= 8;
    }

    //Eine Methode möchtest du überprüfen, ob das Passwort Ziffern enthält.
    public static boolean passwordNumbers(String password) {
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))){
                return true;}
        }
        return false;
    }


}