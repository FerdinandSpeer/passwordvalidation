package org.example;

public class passwordValidation {
    public static void main(String[] args) {

    }
    //Hauptmethode, die alle Validierungen abfrägt
    public static boolean validatePassword(String password) {
        passwordCommon(password);
        passwordNumbers(password);
        passwordLowerCase(password);
        passwordUpperCase(password);
        passwordLength(password);

        return true;
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
    //Zusätzlich möchtest du mit einer Methode sicherstellen, dass
    // sowohl Groß- als auch Kleinbuchstaben im Passwort verwendet werden.
    public static boolean passwordUpperCase(String password) {
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean passwordLowerCase(String password) {
        for (int i = 0; i < password.length(); i++){
            if (Character.isLowerCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    //eine Methode sollte häufig verwendete Passwörter erkennen. Mit Hilfe eines Arrays

    public static boolean passwordCommon(String password) {
        String[] commonPasswords = {
                "123456",
                "password",
                "123456789",
                "12345678",
                "12345",
                "1234567",
                "1234567890",
                "qwerty",
                "abc123",
                "password1"};
    for (String commonPassword : commonPasswords){
        if (password.equals(commonPassword)){
            return true;
        }
    }
    return false;
    }
}