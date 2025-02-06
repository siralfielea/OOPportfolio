import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("============================================================ \n\tPassword Checker \n\tThis will check if your password has the following:\n\t-- Minimum 8 characters\n\t-- Minimum 1 lowercase\n\t-- Minimum 1 uppercase\n\t-- Minimum 1 number\n\t-- Minimum 1 special character\n============================================================ ");
        System.out.println("Enter a password to check: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int passwordChecks = 0;
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters");
        }else passwordChecks++;
        if (!doesStringContainANumber(password)){
            System.out.println("Password must contain at least 1 number");
        }else passwordChecks++;
        if (!doesStringContainSpecialCharacter(password)){
            System.out.println("Password must contain at least 1 special character");
        }else passwordChecks++;
        if (!doesStringContainLowercaseLetter(password)){
            System.out.println("Password must contain at least 1 lowercase letter");
        }else passwordChecks++;
        if (!doesStringContainUppercaseLetter(password)){
            System.out.println("Password must contain at least 1 uppercase letter");
        }else passwordChecks++;
        if (passwordChecks == 5) {
            System.out.println("Password check passes, your password is pretty good :)");
        }
            }

    private static boolean doesStringContainANumber(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                return true;
            }
        }
        return false;
    }


    private static boolean doesStringContainSpecialCharacter(String string) {
        int specialCharacterCount = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!Character.isLetterOrDigit(ch)) specialCharacterCount++;
        }
        return specialCharacterCount >= 1;
    }

    private static boolean doesStringContainLowercaseLetter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                return true;
            }
        }
        return false;
    }
    private static boolean doesStringContainUppercaseLetter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                return true;
            }
        }
        return false;
    }
}
