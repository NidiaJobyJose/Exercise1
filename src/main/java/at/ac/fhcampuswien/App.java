package at.ac.fhcampuswien;

public class App {

    boolean checkLength(String s) {

        int length = s.length();

        if (8 <= length && length <= 25) {
            return true;
        } else {
            return false;
        }
    }

    boolean passwordInstructions(String s) {

        boolean lowerLetter = false;
        boolean upperLetter = false;
        boolean number = false;
        boolean symbol = false;

        int length = s.length();

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowerLetter = true;
            }
            if (Character.isUpperCase(ch)) {
                upperLetter = true;
            }
            if (Character.isDigit(ch)) {
                number = true;
            }

        }
        if (s.matches("[a-zA-Z0-9]")) {
            symbol = false;
        } else {
            symbol = true;
        }

        if (lowerLetter && upperLetter && number && symbol) {
            return true;


        }
        return false;

    }

    boolean checkTwoNumbers(String s) {

        int amountOfNum = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                amountOfNum++;

            }
        }
        if (amountOfNum < 3) {
            return true;
        }
        return false;
    }

    boolean addition(String s) {
        int l = s.length();
        for (int i = 0; i < l - 3; i++) {
            if (Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1)) &&
                    Character.isDigit(s.charAt(i + 2)) && Character.isDigit(s.charAt(i + 3))) {
                if (s.charAt(i) == s.charAt(i + 1) &&
                        s.charAt(i + 1) == s.charAt(i + 2) &&
                        s.charAt(i + 2) == s.charAt(i + 3)) {
                    return false;
                }
            }
        }


        for (int i = 0; i < l - 2; i++) {
            if (Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1)) &&
                    Character.isDigit(s.charAt(i + 2))) {
                if ((int) s.charAt(i) == ((int) s.charAt(i + 1) - 1) &&
                        (int) s.charAt(i + 1) == ((int) s.charAt(i + 2) - 1)) {
                    return false;
                }
            }
        }
    return true; }
        boolean checkPassword (String s){

            if (checkLength(s) && passwordInstructions(s) && checkTwoNumbers(s)) {
                return true;
            } else {
                return false;
            }
        }
    }

    //Zusammenarbeit mit Ekaterina, Aleksandra und Merve

