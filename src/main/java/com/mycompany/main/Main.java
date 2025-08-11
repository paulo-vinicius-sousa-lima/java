package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("KTR");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print(name + ", parabens pelos seus " + idade + " anos de idade.");
    }
}
