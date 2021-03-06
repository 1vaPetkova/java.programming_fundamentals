package T04methods.extra;

import java.util.Scanner;

public class P03EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = Math.abs(Long.parseLong(scan.nextLine()));
        getTheLastDigitName(number);
    }

    private static void getTheLastDigitName(long number) {
        int lastDigit = (int) (number % 10);
        String lastDigitName = "";
        switch (lastDigit) {
            case 0:
                lastDigitName = "zero";
                break;
            case 1:
                lastDigitName = "one";
                break;
            case 2:
                lastDigitName = "two";
                break;
            case 3:
                lastDigitName = "three";
                break;
            case 4:
                lastDigitName = "four";
                break;
            case 5:
                lastDigitName = "five";
                break;
            case 6:
                lastDigitName = "six";
                break;
            case 7:
                lastDigitName = "seven";
                break;
            case 8:
                lastDigitName = "eight";
                break;
            case 9:
                lastDigitName = "nine";
                break;
        }
        System.out.print(lastDigitName);
    }
}
