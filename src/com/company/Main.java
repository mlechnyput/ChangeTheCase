package com.company;

import java.util.Scanner;

import static java.lang.Character.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = scanner.nextLine();
        changeTheCase(str);
    }

    public static void changeTheCase(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isUpperCase(c)) c = toLowerCase(c);
            else if (isLowerCase(c)) c = toUpperCase(c);
            newString += c;
        }
        System.out.print(newString);
    }
}
