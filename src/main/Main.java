package main;

import person.person;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        person per1 = new person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cho per1: ");
        String name = sc.nextLine();
        per1.setName(name);
        System.out.println("ten cua ban per1 la: " + per1.getName());
    }
}
