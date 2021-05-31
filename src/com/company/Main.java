package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String names[] = new String[3];
        String names1[] = {"Илья", "Макс", "Дастан", "John"};
        names = names1;
        for (int i = 0; i < names.length; i++) {
            switch (names[i]) {
                case "Илья":
                    System.out.println(names[0] + ", доброе утро");
                    break;
                case "Макс":
                    System.out.println(names[1] + ", добрый день");
                    break;
                case "Дастан":
                    System.out.println(names[2] + ", добрый вечер");
                    break;
                case "John":
                    System.out.println(names[3] + ", спокойной ночи");
                    break;

            }
        }

    }
}
