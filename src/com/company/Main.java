package com.company;

import java.util.Scanner;

public class Main {
    public static void mnojiteli(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.print(n + " ");
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.print(k + " ");
            mnojiteli(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            mnojiteli(n, ++k);
        }
    }
    public static boolean polindrom(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        String without = word.substring(1, word.length() - 2);//удалили первый и последний
        boolean result;
        result = polindrom(without);
        return result;

    }
    public static int maximumOfSequence() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, maximumOfSequence());
        }
    }


    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int num = in.nextInt();
        if(num>0){
            mnojiteli(num,2);
        }
        else{
            System.out.println("Не натуральное число");
        }
        System.out.println("\nВведите слово для проверки палиндрома");
        in.nextLine();
        String word = in.nextLine();
        if(polindrom(word)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        System.out.println("Введите последовательность чисел");
        System.out.println("Максимум последовательности: " + maximumOfSequence());

        in.close();
    }
}
