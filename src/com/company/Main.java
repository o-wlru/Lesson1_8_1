package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        printIsLeapYear(2400);

        System.out.println("Задание 2");
        printRecommendApplicationVersion(0, 2010);

        System.out.println("Задание 3");
        System.out.println("Количество дней доставки: " + calculateDeliveryDays(117));

        System.out.println("Задание 4");
        findAndPrintDuplicates("aabccddefgghiijjkk");

        System.out.println("Задание 5");
        int[] number = new int[]{3, 2, 1, 6, 5};
        reverseArray(number);
        System.out.println("revers: " + Arrays.toString(number));

        System.out.println("Задание 6*");
        int[] expenses = generateRandomArray();
        for (int a : expenses) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //Задание 1
    public static void printIsLeapYear(int yearToCheck) {
        boolean yearLeap = isYearLeap(yearToCheck);
        printIsLeapYearResult(yearToCheck, yearLeap);
    }

    public static boolean isYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printIsLeapYearResult(int yearPrint, boolean yearLeap) {
        if (yearLeap) {
            System.out.println(yearPrint + " - високосный");
        } else {
            System.out.println(yearPrint + " - обыкновенный");
        }
    }

    //Задание 2
    public static void printRecommendApplicationVersion(int os, int deviceYear) {
        boolean devaiceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (devaiceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (os == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }

    public static boolean isDeviceOld(int deviceYear) {
        int currentYear = 2021;
        return deviceYear <= currentYear;
    }

    //задание 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60) {
            result++;
        }
        return result;
    }

    //задание 4
    public static void findAndPrintDuplicates(String text) {
        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Дубль по символу " + letter);
                return;
            }
            prevChar = letter;
        }
        System.out.println("дублей не найдено");
    }

    //задание 5
    public static void reverseArray(int[] number) {
        int head = 0;
        int end = number.length - 1;
        while (head < end) {
            int temp = number[head];
            number[head++] = number[end];
            number[end--] = temp;
        }
    }

    //задание 6*
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenses = new int[30];
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(100_000) + 100_000;
        }
        return expenses;
    }

}










