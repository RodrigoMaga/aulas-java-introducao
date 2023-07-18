package org.example.helpers;

import java.util.Scanner;

public class InputUserTerminal {
    public static int askInt(String input) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(input);
//        int grade = scanner.nextInt();
//        return grade; mesma coisa da linha abaixo
        return scanner.nextInt();
    }
}
