package Vigian.Musaku.util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner=new Scanner(System.in);

    public static String inputstring ( String info){
        System.out.println(info + ": ");
        String data = scanner.next();
        return data;
    }
    public static int inputInt ( String info){
        System.out.println(info + ": ");
        int data = scanner.nextInt();
        return data;
    }
}
