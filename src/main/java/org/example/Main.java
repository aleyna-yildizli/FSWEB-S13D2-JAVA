package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Palindrom Sayılar Testi:");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("Mükemmel Sayılar Testi:");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("Sayıları Kelimelere Cevirme Testi:");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int totalDivisors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                totalDivisors += i;
            }
        }

        return totalDivisors == number;
    }

/*    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder result = new StringBuilder();
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            result.append(words[digit]).append(" ");
        }

        return result.toString().trim();
    }*/

    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value";

        char[] digits = String.valueOf(number).toCharArray();
        StringBuilder numToTextBuilder = new StringBuilder();

        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numToTextBuilder.append("Zero ");
                    break;
                case '1':
                    numToTextBuilder.append("One ");
                    break;
                case '2':
                    numToTextBuilder.append("Two ");
                    break;
                case '3':
                    numToTextBuilder.append("Three ");
                    break;
                case '4':
                    numToTextBuilder.append("Four ");
                    break;
                case '5':
                    numToTextBuilder.append("Five ");
                    break;
                case '6':
                    numToTextBuilder.append("Six ");
                    break;
                case '7':
                    numToTextBuilder.append("Seven ");
                    break;
                case '8':
                    numToTextBuilder.append("Eight ");
                    break;
                case '9':
                    numToTextBuilder.append("Nine ");
                    break;
            }
        }
        return numToTextBuilder.toString().trim();
    }
}


