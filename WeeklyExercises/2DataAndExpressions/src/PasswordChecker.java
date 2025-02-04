import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("============================================================ \n\tPassword Checker \n\tThis will check if your password has the following:\n\t-- Minimum 8 characters\n\t-- Minimum 1 lowercase\n\t-- Minimum 1 uppercase\n\t-- Minimum 1 number\n\t-- Minimum 1 special character\n============================================================ ");
        System.out.println("Enter a password to check: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters");
        } else if (!(doesStringContainLowercaseLetter(password) && doesStringContainUppercaseLetter(password))) {
            System.out.println("Password does not contain lower case and uppercase letters");
            if (!(doesStringContainSpecialCharacter(password))){
                System.out.println("Password does not contain special characters");
            } else {
                if (!doesStringContainANumber(password)) {
                    System.out.println("Password doesnt contain a number");
                }
            }
        }
        else System.out.println("Your password " + password + " is checked and good");
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
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isLetterOrDigit(ch)) return true;
        }
        return false;
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
