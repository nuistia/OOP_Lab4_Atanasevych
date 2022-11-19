package Lab4;

import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
    }

    final static Scanner sc = new Scanner(System.in);

    static void taskOne() {
        System.out.println("Введите строку для Задания 1:");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int count = 0;
        for (String s : str1) {
            if (s.length() == 4) {
                System.out.print(s + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Слов, состоящих из 4-х букв, нет.");
        }
        System.out.println();
    }

    static void taskTwo() {
        System.out.println("\nВведите строку для Задания 2:");
        String str = sc.nextLine();
        String str1 = Translit.toCyrillic(str);
        System.out.println("Транслитерированная строка:");
        System.out.println(str1);
    }

    static void taskThree() {
        System.out.println("Введите строку для Задания 3:");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int count = 0;
        for (String s : str1) {
            if (s.matches("[a-zA-z]+")) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Слов, состоящих из латиницы, нет.");
        } else {
            System.out.println("Количество слов, состоящих из латиницы: " + count);
        }

        System.out.println();
    }


    static void taskFour() {
        System.out.println("Введите строку для Задания 4:");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int count = 0;
        for (String s : str1) {
            if (s.matches("[0-9]+")) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Слов, состоящих из цифр, нет.");
        } else {
            System.out.println("Количество слов, состоящих из цифр: " + count);
        }
        System.out.println();
    }

    static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static void taskFive() {
        System.out.println("Введите строку для Задания 5:");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int count = 0;
        System.out.println("Слова-палиндромы:");
        for (String s : str1) {
            if (s.matches("[0-9]+") && isPalindrome(s)) {
                System.out.print(s + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Слов-палиндромов нет.");
        } else {
            System.out.println("Количество слов-палиндромов: " + count);
        }
        System.out.println();
    }
}


 /*
        1. Задана строка, состоящая из нескольких слов. Вывести на консоль слова из строки,
    состоящие из 4 букв.
        2. Заменить все символы кириллицы в слове на соответствующие символы латиницы.
        3. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского
        алфавита.
        4. Ввести n слов с консоли. Найти количество слов, содержащих только цифры.
        5. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
 */